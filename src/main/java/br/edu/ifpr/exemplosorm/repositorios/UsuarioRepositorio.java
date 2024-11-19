package br.edu.ifpr.exemplosorm.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario extends CrudRepository<Usuario, Integer> { }
