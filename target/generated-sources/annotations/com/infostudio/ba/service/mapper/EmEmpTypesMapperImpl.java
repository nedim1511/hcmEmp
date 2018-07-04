package com.infostudio.ba.service.mapper;

import com.infostudio.ba.domain.EmEmpTypes;
import com.infostudio.ba.service.dto.EmEmpTypesDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-07-04T14:12:39+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_172 (Oracle Corporation)"
)
@Component
public class EmEmpTypesMapperImpl implements EmEmpTypesMapper {

    @Override
    public EmEmpTypes toEntity(EmEmpTypesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EmEmpTypes emEmpTypes = new EmEmpTypes();

        emEmpTypes.setCreatedBy( dto.getCreatedBy() );
        emEmpTypes.setCreatedAt( dto.getCreatedAt() );
        emEmpTypes.setUpdatedBy( dto.getUpdatedBy() );
        emEmpTypes.setUpdatedAt( dto.getUpdatedAt() );
        emEmpTypes.setId( dto.getId() );
        emEmpTypes.setCode( dto.getCode() );
        emEmpTypes.setName( dto.getName() );
        emEmpTypes.setDescription( dto.getDescription() );

        return emEmpTypes;
    }

    @Override
    public EmEmpTypesDTO toDto(EmEmpTypes entity) {
        if ( entity == null ) {
            return null;
        }

        EmEmpTypesDTO emEmpTypesDTO = new EmEmpTypesDTO();

        emEmpTypesDTO.setId( entity.getId() );
        emEmpTypesDTO.setCode( entity.getCode() );
        emEmpTypesDTO.setName( entity.getName() );
        emEmpTypesDTO.setDescription( entity.getDescription() );
        emEmpTypesDTO.setCreatedBy( entity.getCreatedBy() );
        emEmpTypesDTO.setCreatedAt( entity.getCreatedAt() );
        emEmpTypesDTO.setUpdatedBy( entity.getUpdatedBy() );
        emEmpTypesDTO.setUpdatedAt( entity.getUpdatedAt() );

        return emEmpTypesDTO;
    }

    @Override
    public List<EmEmpTypes> toEntity(List<EmEmpTypesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<EmEmpTypes> list = new ArrayList<EmEmpTypes>( dtoList.size() );
        for ( EmEmpTypesDTO emEmpTypesDTO : dtoList ) {
            list.add( toEntity( emEmpTypesDTO ) );
        }

        return list;
    }

    @Override
    public List<EmEmpTypesDTO> toDto(List<EmEmpTypes> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<EmEmpTypesDTO> list = new ArrayList<EmEmpTypesDTO>( entityList.size() );
        for ( EmEmpTypes emEmpTypes : entityList ) {
            list.add( toDto( emEmpTypes ) );
        }

        return list;
    }
}