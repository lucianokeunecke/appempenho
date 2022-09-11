package br.edu.infnet.appempenho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@GetMapping("/usuario/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", UsuarioService.obterLista());
		
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		
		UsuarioService.incluir(usuario);
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/{email}/excluir")
	public String excluir(@PathVariable String email) {
		
		UsuarioService.excluir(email);
		
		return "redirect:/usuario/lista";
	}

}
