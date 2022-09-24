package br.edu.infnet.appempenho.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.Concorrencia;

@Repository
public interface ConcorrenciaRepository extends CrudRepository<Concorrencia, Integer> {

	@Query("from Concorrencia c where c.usuario.id = :idUsuario")
	Collection<Concorrencia> obterLista(int idUsuario);

}
