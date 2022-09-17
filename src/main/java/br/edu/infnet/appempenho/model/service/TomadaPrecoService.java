package br.edu.infnet.appempenho.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class TomadaPrecoService {
	
	private static Map<Integer, TomadaPreco> mapaTomadaPreco = new HashMap<Integer, TomadaPreco>();
	
	private static Integer id = 1;
	
	public void incluir(TomadaPreco tomadaPreco) {
		
		tomadaPreco.setId(id++);
		
		mapaTomadaPreco.put(tomadaPreco.getId(), tomadaPreco);
		
		AppImpressao.relatorio("Inclusão da Tomada de Preço Nº " + tomadaPreco.getNumero(), tomadaPreco);
	}
	
	public void excluir(Integer id) {
		mapaTomadaPreco.remove(id);
	}
	
	public Collection<TomadaPreco> obterLista(){
		return mapaTomadaPreco.values();
	}

}
