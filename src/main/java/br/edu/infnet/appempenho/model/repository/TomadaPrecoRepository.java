package br.edu.infnet.appempenho.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;

@Repository
public interface TomadaPrecoRepository extends CrudRepository<TomadaPreco, Integer> {

}
