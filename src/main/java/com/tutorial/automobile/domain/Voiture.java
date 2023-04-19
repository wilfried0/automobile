package com.tutorial.automobile.domain;

import com.tutorial.automobile.domain.enums.ModeleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
public class Voiture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    private Categorie categorie;

    @Enumerated
    private ModeleEnum modeleEnum;
}
