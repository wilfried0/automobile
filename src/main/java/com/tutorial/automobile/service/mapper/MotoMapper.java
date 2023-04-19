package com.tutorial.automobile.service.mapper;

import com.tutorial.automobile.domain.Moto;
import com.tutorial.automobile.service.dto.MotoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CategorieMapper.class})
public interface MotoMapper {
    Moto toEntity(MotoDTO motoDTO);
    MotoDTO toDTO(Moto moto);
}
