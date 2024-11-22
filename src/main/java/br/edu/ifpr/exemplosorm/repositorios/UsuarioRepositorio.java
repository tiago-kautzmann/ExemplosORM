package br.edu.ifpr.exemplosorm.repositorios;

import br.edu.ifpr.exemplosorm.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> { }


