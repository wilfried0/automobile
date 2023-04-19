package com.tutorial.automobile.service.impl;

import com.tutorial.automobile.repository.VoitureRepository;
import com.tutorial.automobile.service.VoitureService;
import com.tutorial.automobile.service.dto.VoitureDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor(onConstructor = @__(@Autowired)) //Initialise mon repository via l'aop
public class VoitureServiceImpl implements VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;
    @Override
    public VoitureDTO create(VoitureDTO voitureDTO) {

        return null;//voitureRepository.save(null);
    }
}
