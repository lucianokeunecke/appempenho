package br.edu.infnet.appempenho.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class FornecedorService {
	
	private static Map<Integer, Fornecedor> mapaFornecedor = new HashMap<Integer, Fornecedor>();
	
	private static Integer id = 1;
	
	public void incluir(Fornecedor fornecedor) {
		
		fornecedor.setId(id++);
		
		mapaFornecedor.put(fornecedor.getId(), fornecedor);
		
		AppImpressao.relatorio("Inclusão do Fornecedor " + fornecedor.getNome(), fornecedor);
	}
	
	public void excluir(Integer id) {
		mapaFornecedor.remove(id);
	}
	
	public Collection<Fornecedor> obterLista(){
		return mapaFornecedor.values();
	}

}
