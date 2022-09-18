package br.edu.infnet.appempenho.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.Empenho;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class EmpenhoService {
	
	private static Map<Integer, Empenho> mapaEmpenho = new HashMap<Integer, Empenho>();
	
	private static Integer id = 1;
	
	public void incluir(Empenho empenho) {
		
		empenho.setId(id++);
		
		mapaEmpenho.put(empenho.getId(), empenho);
		
		AppImpressao.relatorio("Inclusão do Empenho Nº " + empenho.getNumero(), empenho);
	}
	
	public void excluir(Integer id) {
		mapaEmpenho.remove(id);
	}
	
	public Collection<Empenho> obterLista(){
		return mapaEmpenho.values();
	}

}
