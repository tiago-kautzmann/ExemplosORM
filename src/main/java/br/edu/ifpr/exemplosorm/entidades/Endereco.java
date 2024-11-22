package br.edu.ifpr.exemplosorm.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Endereco {

    @Id
    private int id;

    private String logradouro;

    private int numero;

    private String cidade;

    private String estado;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}


