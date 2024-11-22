package br.edu.ifpr.exemplosorm.repositorios;

import br.edu.ifpr.exemplosorm.entidades.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> { }


