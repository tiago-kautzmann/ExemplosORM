package br.edu.ifpr.exemplosorm.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String turno;

    @ManyToMany
    @JoinTable(
            name = "estudante_turma",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "estudante_id")
    )
    private List<Estudante> estudantes;

}


