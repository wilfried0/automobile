package com.tutorial.automobile.service.impl;

import com.tutorial.automobile.repository.VoitureRepository;
import com.tutorial.automobile.service.VoitureService;
import com.tutorial.automobile.service.dto.VoitureDTO;
import com.tutorial.automobile.service.mapper.VoitureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor(onConstructor = @__(@Autowired)) //Initialise mon repository via l'aop
public class VoitureServiceImpl implements VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;
    @Autowired
    private VoitureMapper voitureMapper;
    @Override
    public VoitureDTO create(VoitureDTO voitureDTO) {
        return voitureMapper.toDTO(voitureRepository.save(voitureMapper.toEntity(voitureDTO)));
    }
}
