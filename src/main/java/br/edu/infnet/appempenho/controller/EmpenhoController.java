package br.edu.infnet.appempenho.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appempenho.model.domain.Empenho;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Controller
public class EmpenhoController {
	
	private static Map<Integer, Empenho> mapaEmpenho = new HashMap<Integer, Empenho>();
	
	private static Integer id = 1;
	
	public static void incluir(Empenho empenho) {
		
		empenho.setId(id++);
		
		mapaEmpenho.put(empenho.getId(), empenho);
		
		AppImpressao.relatorio("Inclusão do Empenho Nº " + empenho.getNumero(), empenho);
	}
	
	public static void excluir(Integer id) {
		mapaEmpenho.remove(id);
	}
	
	public static Collection<Empenho> obterLista(){
		return mapaEmpenho.values();
	}
	
	@GetMapping("/empenho/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", obterLista());
		
		return "empenho/lista";
	}
	
	@GetMapping("/empenho/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/empenho/lista";
	}		

}
