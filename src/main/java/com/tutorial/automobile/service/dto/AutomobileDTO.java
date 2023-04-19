package com.tutorial.automobile.service.dto;

import lombok.Builder;

@Builder
public class AutomobileDTO {
    protected Long id;
    protected String name;
    protected Enum modeleEnum;
    protected CategorieDTO categorieDTO;
}
