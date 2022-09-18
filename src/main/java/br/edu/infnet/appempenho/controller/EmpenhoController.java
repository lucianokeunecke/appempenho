package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appempenho.model.domain.Empenho;
import br.edu.infnet.appempenho.model.service.EmpenhoService;

@Controller
public class EmpenhoController {
	
	@Autowired
	private EmpenhoService empenhoService;
	
	@GetMapping("/empenho/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", empenhoService.obterLista());
		
		return "empenho/lista";
	}
	
	@GetMapping(value = "/empenho")
	public String telaCadastro(Model model) {
		
		model.addAttribute("fornecedores", null);
		model.addAttribute("processosLicitatorios", null);
		
		return "empenho/cadastro";
	}
	
	@PostMapping(value = "empenho/incluir")
	public String incluir(Empenho empenho) {
		
		//empenhoService.incluir(empenho);
		
		return "redirect:/concorrencia/lista";
	}	
	
	@GetMapping("/empenho/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		empenhoService.excluir(id);
		
		return "redirect:/empenho/lista";
	}		

}
