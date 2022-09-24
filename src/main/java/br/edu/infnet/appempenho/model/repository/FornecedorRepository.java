package br.edu.infnet.appempenho.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.Fornecedor;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Integer> {
	
	@Query("from Fornecedor f where f.usuario.id = :idUsuario")
	List<Fornecedor> obterLista(Integer idUsuario);

}
