package br.edu.infnet.appempenho.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Controller
public class PregaoController {
	
	private static Map<Integer, Pregao> mapaPregao = new HashMap<Integer, Pregao>();
	
	private static Integer id = 1;
	
	public static void incluir(Pregao pregao) {
		
		pregao.setId(id++);
		
		mapaPregao.put(pregao.getId(), pregao);
		
		AppImpressao.relatorio("Inclusão do Pregão Nº " + pregao.getNumero(), pregao);
	}
	
	public static void excluir(Integer id) {
		mapaPregao.remove(id);
	}
	
	public static Collection<Pregao> obterLista(){
		return mapaPregao.values();
	}	
	
	@GetMapping("/pregao/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", obterLista());
		
		return "pregao/lista";
	}	
	
	@GetMapping("/pregao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/pregao/lista";
	}	

}
