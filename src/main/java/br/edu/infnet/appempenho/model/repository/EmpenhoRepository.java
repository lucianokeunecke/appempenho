package br.edu.infnet.appempenho.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.Empenho;

@Repository
public interface EmpenhoRepository extends CrudRepository<Empenho, Integer> {
	
	@Query("from Empenho e where e.usuario.id = :idUsuario")
	List<Empenho> obterLista(Integer idUsuario);

}
