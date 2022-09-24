package br.edu.infnet.appempenho.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.repository.PregaoRepository;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class PregaoService {
	
	@Autowired
	private PregaoRepository pregaoRepository;
	
	public void incluir(Pregao pregao) {
		
		pregaoRepository.save(pregao);
		
		AppImpressao.relatorio("Inclusão do Pregão Nº " + pregao.getNumero(), pregao);
	}
	
	public void excluir(Integer id) {
		
		pregaoRepository.deleteById(id);
	}
	
	public Collection<Pregao> obterLista(){
		
		return (Collection<Pregao>) pregaoRepository.findAll();
	}

}
