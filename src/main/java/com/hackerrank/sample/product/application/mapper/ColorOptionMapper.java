package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.ColorOption;
import com.hackerrank.sample.product.infrastructure.entity.ColorOptionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public
interface ColorOptionMapper {

    // Entity → Domain: colorName → name
    @Mapping(target = "name", source = "colorName")
    @Mapping(target = "hexCode", source = "hexCode")
    @Mapping(target = "imageUrl", ignore = true) // ColorOptionEntity no tiene imageUrl
    ColorOption toDomain(ColorOptionEntity entity);

    // Domain → Entity
    @Mapping(target = "colorName", source = "name")
    @Mapping(target = "hexCode", source = "hexCode")
    @Mapping(target = "product", ignore = true) // Se establece en el servicio
    ColorOptionEntity toEntity(ColorOption domain);
}