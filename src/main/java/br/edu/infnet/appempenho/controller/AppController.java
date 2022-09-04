package br.edu.infnet.appempenho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appempenho.model.domain.Usuario;

@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}

	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = UsuarioController.validar(email, senha);
		
		if (usuario != null) {
			
			model.addAttribute("user", usuario.getNome());
			
			//return "redirect:/";
			return "home";
		}
		
		//return "redirect:/login";
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String logout(Model model) {
		
		model.addAttribute("user", "");
		
		//return "home";
		return "redirect:/";
	}

}
