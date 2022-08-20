package br.edu.infnet.appempenho.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Controller
public class TomadaPrecoController {
	
	private static Map<Integer, TomadaPreco> mapaTomadaPreco = new HashMap<Integer, TomadaPreco>();
	
	private static Integer id = 1;
	
	public static void incluir(TomadaPreco tomadaPreco) {
		
		tomadaPreco.setId(id++);
		
		mapaTomadaPreco.put(tomadaPreco.getId(), tomadaPreco);
		
		AppImpressao.relatorio("Inclusão da Tomada de Preço Nº " + tomadaPreco.getNumero(), tomadaPreco);
	}
	
	public static void excluir(Integer id) {
		mapaTomadaPreco.remove(id);
	}
	
	public static Collection<TomadaPreco> obterLista(){
		return mapaTomadaPreco.values();
	}
	
	@GetMapping("/tomadaPreco/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", obterLista());
		
		return "tomadaPreco/lista";
	}
	
	@GetMapping("/tomadaPreco/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/tomadaPreco/lista";
	}	

}
