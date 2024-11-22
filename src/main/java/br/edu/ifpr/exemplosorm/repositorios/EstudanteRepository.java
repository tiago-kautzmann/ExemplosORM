package br.edu.ifpr.exemplosorm.repositorios;

import br.edu.ifpr.exemplosorm.entidades.Estudante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends CrudRepository<Estudante, Integer> { }


