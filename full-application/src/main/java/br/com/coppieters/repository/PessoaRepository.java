package br.com.coppieters.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.coppieters.model.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}
