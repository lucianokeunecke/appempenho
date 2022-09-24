package br.edu.infnet.appempenho.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;

@Repository
public interface TomadaPrecoRepository extends CrudRepository<TomadaPreco, Integer> {

	@Query("from TomadaPreco tp where tp.usuario.id = :idUsuario")
	Collection<TomadaPreco> obterLista(int idUsuario);	
}
