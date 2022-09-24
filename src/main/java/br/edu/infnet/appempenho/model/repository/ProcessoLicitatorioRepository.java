package br.edu.infnet.appempenho.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.ProcessoLicitatorio;

@Repository
public interface ProcessoLicitatorioRepository extends CrudRepository<ProcessoLicitatorio, Integer> {

	@Query("from ProcessoLicitatorio pl where pl.usuario.id = :idUsuario")
	Collection<ProcessoLicitatorio> obterLista(int idUsuario);

}
