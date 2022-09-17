package br.edu.infnet.appempenho.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class PregaoService {
	
	private static Map<Integer, Pregao> mapaPregao = new HashMap<Integer, Pregao>();
	
	private static Integer id = 1;
	
	public void incluir(Pregao pregao) {
		
		pregao.setId(id++);
		
		mapaPregao.put(pregao.getId(), pregao);
		
		AppImpressao.relatorio("Inclusão do Pregão Nº " + pregao.getNumero(), pregao);
	}
	
	public void excluir(Integer id) {
		mapaPregao.remove(id);
	}
	
	public Collection<Pregao> obterLista(){
		return mapaPregao.values();
	}

}
