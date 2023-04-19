package com.tutorial.automobile.web.rest;

import com.tutorial.automobile.repository.VoitureRepository;
import com.tutorial.automobile.service.VoitureService;
import com.tutorial.automobile.service.dto.VoitureDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VoitureResource {

    @Autowired
    private VoitureService voitureService;
    @PostMapping("/create")
    public ResponseEntity<VoitureDTO> create(@RequestBody VoitureDTO voitureDTO){
        return ResponseEntity.ok(voitureService.create(voitureDTO));
    }
}
