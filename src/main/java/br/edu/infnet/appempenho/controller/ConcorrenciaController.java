package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.ConcorrenciaService;

@Controller
public class ConcorrenciaController {
	
	@Autowired
	private ConcorrenciaService concorrenciaService;
	
	@GetMapping("/concorrencia/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		
		model.addAttribute("listagem", concorrenciaService.obterLista(usuario));
		
		return "concorrencia/lista";
	}
	
	@GetMapping(value = "/concorrencia")
	public String telaCadastro() {
		
		return "concorrencia/cadastro";
	}	
	
	@PostMapping(value = "concorrencia/incluir")
	public String incluir(Concorrencia concorrencia, @SessionAttribute("user") Usuario usuario) {
		
		concorrencia.setUsuario(usuario);
		
		concorrenciaService.incluir(concorrencia);
		
		return "redirect:/concorrencia/lista";
	}		
	
	@GetMapping("/concorrencia/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		concorrenciaService.excluir(id);
		
		return "redirect:/concorrencia/lista";
	}

}
