package br.edu.ifpr.exemplosorm.repositorios;

import br.edu.ifpr.exemplosorm.entidades.Turma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends CrudRepository<Turma, Integer> { }




