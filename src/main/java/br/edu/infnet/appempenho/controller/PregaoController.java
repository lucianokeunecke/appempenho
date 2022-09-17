package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.service.PregaoService;

@Controller
public class PregaoController {
	
	@Autowired
	private PregaoService pregaoService;	
	
	@GetMapping("/pregao/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", pregaoService.obterLista());
		
		return "pregao/lista";
	}	
	
	@GetMapping(value = "/pregao")
	public String telaCadastro() {
		
		return "pregao/cadastro";
	}	
	
	@PostMapping(value = "pregao/incluir")
	public String incluir(Pregao pregao) {
		
		pregaoService.incluir(pregao);
		
		return "redirect:/pregao/lista";
	}	
	
	@GetMapping("/pregao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		pregaoService.excluir(id);
		
		return "redirect:/pregao/lista";
	}	

}
