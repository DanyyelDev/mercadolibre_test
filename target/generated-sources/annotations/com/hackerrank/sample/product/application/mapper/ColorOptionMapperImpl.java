package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.ColorOption;
import com.hackerrank.sample.product.infrastructure.entity.ColorOptionEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-26T11:15:48-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class ColorOptionMapperImpl implements ColorOptionMapper {

    @Override
    public ColorOption toDomain(ColorOptionEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ColorOption colorOption = new ColorOption();

        colorOption.setName( entity.getColorName() );
        colorOption.setHexCode( entity.getHexCode() );

        return colorOption;
    }

    @Override
    public ColorOptionEntity toEntity(ColorOption domain) {
        if ( domain == null ) {
            return null;
        }

        ColorOptionEntity colorOptionEntity = new ColorOptionEntity();

        colorOptionEntity.setColorName( domain.getName() );
        colorOptionEntity.setHexCode( domain.getHexCode() );

        return colorOptionEntity;
    }
}
