package br.edu.ifpr.exemplosorm;

import br.edu.ifpr.exemplosorm.entidades.Endereco;
import br.edu.ifpr.exemplosorm.repositorios.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplosOrmApplication implements CommandLineRunner {

    @Autowired
    private EstudanteRepository estudanteRepo;

    @Autowired
    private TurmaRepository turmaRepo;

    public static void main(String[] args) {
        SpringApplication.run(ExemplosOrmApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        estudanteRepo.findAll().forEach(estudante -> {
            System.out.println(estudante.getId());
            System.out.println(estudante.getNome());
            estudante.getTurmas().forEach(turma -> {
                System.out.println(turma.getId());
                System.out.println(turma.getTurno());
            });
        });

        turmaRepo.findAll().forEach(turma -> {
            System.out.println(turma.getId());
            System.out.println(turma.getTurno());
            turma.getEstudantes().forEach(estudante -> {
                System.out.println(estudante.getId());
                System.out.println(estudante.getNome());
            });
        });
    }

}
