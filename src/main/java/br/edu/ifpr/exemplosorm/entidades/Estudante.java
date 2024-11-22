package br.edu.ifpr.exemplosorm.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity @Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @ManyToMany(mappedBy = "estudantes")
    private List<Turma> turmas;

}


