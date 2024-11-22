package br.edu.ifpr.exemplosorm.repositorios;

import br.edu.ifpr.exemplosorm.entidades.Departamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends CrudRepository<Departamento, Integer> { }

