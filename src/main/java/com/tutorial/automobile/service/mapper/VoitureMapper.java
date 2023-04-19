package com.tutorial.automobile.service.mapper;

import com.tutorial.automobile.domain.Voiture;
import com.tutorial.automobile.service.dto.VoitureDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CategorieMapper.class})
public interface VoitureMapper {
    Voiture toEntity(VoitureDTO voitureDTO);
    VoitureDTO toDTO(Voiture voiture);
}
