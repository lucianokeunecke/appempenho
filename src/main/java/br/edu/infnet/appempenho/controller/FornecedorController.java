package br.edu.infnet.appempenho.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Controller
public class FornecedorController {
	
	private static Map<Integer, Fornecedor> mapaFornecedor = new HashMap<Integer, Fornecedor>();
	
	private static Integer id = 1;
	
	public static void incluir(Fornecedor fornecedor) {
		
		fornecedor.setId(id++);
		
		mapaFornecedor.put(fornecedor.getId(), fornecedor);
		
		AppImpressao.relatorio("Inclusão do Fornecedor Nº " + fornecedor.getCodigo(), fornecedor);
	}
	
	public static void excluir(Integer id) {
		mapaFornecedor.remove(id);
	}
	
	public static Collection<Fornecedor> obterLista(){
		return mapaFornecedor.values();
	}	
	
	@GetMapping("/fornecedor/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", obterLista());
		
		return "fornecedor/lista";
	}
	
	@GetMapping("/fornecedor/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/fornecedor/lista";
	}
}
