package br.edu.infnet.appempenho.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.Pregao;

@Repository
public interface PregaoRepository extends CrudRepository<Pregao, Integer> {
	
	@Query("from Pregao p where p.usuario.id = :idUsuario")
	Collection<Pregao> obterLista(int idUsuario);

}
