package com.tutorial.automobile.service.mapper;

import com.tutorial.automobile.domain.Categorie;
import com.tutorial.automobile.service.dto.CategorieDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorieMapper {
    Categorie toEntity(CategorieDTO categorieDTO);
    CategorieDTO toDTO(Categorie categorie);
}
