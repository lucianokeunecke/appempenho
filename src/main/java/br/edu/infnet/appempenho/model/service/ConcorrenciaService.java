package br.edu.infnet.appempenho.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class ConcorrenciaService {
	
	private static Map<Integer, Concorrencia> mapaConcorrencia = new HashMap<Integer, Concorrencia>();
	
	private static Integer id = 1;
	
	public void incluir(Concorrencia concorrencia) {
		
		concorrencia.setId(id++);
		
		mapaConcorrencia.put(concorrencia.getId(), concorrencia);
		
		AppImpressao.relatorio("Inclusão da Concorrência Nº " + concorrencia.getNumero(), concorrencia);
	}
	
	public void excluir(Integer id) {
		mapaConcorrencia.remove(id);
	}
	
	public Collection<Concorrencia> obterLista(){
		return mapaConcorrencia.values();
	}	

}
