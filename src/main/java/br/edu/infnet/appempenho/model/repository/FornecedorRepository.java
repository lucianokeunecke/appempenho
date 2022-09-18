package br.edu.infnet.appempenho.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.Fornecedor;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Integer> {

}
