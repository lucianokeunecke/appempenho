package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.TomadaPrecoService;

@Controller
public class TomadaPrecoController {
	
	@Autowired
	private TomadaPrecoService tomadaPrecoService;
	
	@GetMapping("/tomadaPreco/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		
		model.addAttribute("listagem", tomadaPrecoService.obterLista(usuario));
		
		return "tomadaPreco/lista";
	}
	
	@GetMapping(value = "/tomadaPreco")
	public String telaCadastro() {
		
		return "tomadaPreco/cadastro";
	}	
	
	@PostMapping(value = "tomadaPreco/incluir")
	public String incluir(TomadaPreco tomadaPreco, @SessionAttribute("user") Usuario usuario) {
		
		tomadaPreco.setUsuario(usuario);
		
		tomadaPrecoService.incluir(tomadaPreco);
		
		return "redirect:/tomadaPreco/lista";
	}	
	
	@GetMapping("/tomadaPreco/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		tomadaPrecoService.excluir(id);
		
		return "redirect:/tomadaPreco/lista";
	}	

}
