package br.edu.ifpr.exemplosorm.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Funcionario> funcionarios;

}


