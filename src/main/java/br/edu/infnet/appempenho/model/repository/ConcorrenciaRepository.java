package br.edu.infnet.appempenho.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appempenho.model.domain.Concorrencia;

@Repository
public interface ConcorrenciaRepository extends CrudRepository<Concorrencia, Integer> {

}
