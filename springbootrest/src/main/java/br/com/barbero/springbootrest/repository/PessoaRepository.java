package br.com.barbero.springbootrest.repository;

import java.util.List;

import br.com.barbero.springbootrest.beans.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "pessoa")
public interface PessoaRepository extends CrudRepository<Pessoa, Long>, PagingAndSortingRepository<Pessoa, Long> {

	List<Pessoa> findByNome(@Param(value = "nome") String nome);
	
	List<Pessoa> findByEmail(@Param(value = "email") String email);

}
