package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.ProcessoLicitatorioService;

@Controller
public class ProcessoLicitatorioController {
	
	@Autowired
	private ProcessoLicitatorioService processoLicitatorioService;
	
	@GetMapping("/processoLicitatorio/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		
		model.addAttribute("listagem", processoLicitatorioService.obterLista(usuario));
		
		return "processoLicitatorio/lista";
	}
	
	@GetMapping("/processoLicitatorio/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		processoLicitatorioService.excluir(id);
		
		return "redirect:/processoLicitatorio/lista";
	}

}
