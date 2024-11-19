package br.edu.ifpr.exemplosorm.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Departamento extends CrudRepository<Departamento, Integer> { }
