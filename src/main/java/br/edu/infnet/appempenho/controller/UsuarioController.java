package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	private String mensagem;
	private String tipoMensagem;
	
	@GetMapping("/usuario/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", usuarioService.obterLista());
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipoMensagem", tipoMensagem);
		
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		
		usuarioService.incluir(usuario);
		
		mensagem = "Inclusão do Usuário " + usuario.getNome() + " realizado com sucesso";
		tipoMensagem = "alert-success";
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/{email}/excluir")
	public String excluir(@PathVariable String email) {
		
		try {
			usuarioService.excluir(email);
			
			mensagem = "Exclusão do Usuário " + email + " realizado com sucesso";
			tipoMensagem = "alert-success";
		} catch (Exception e) {
			mensagem = "Impossível realizar a exclusão do Usuário " + email;
			tipoMensagem = "alert-danger";
		}
		
		return "redirect:/usuario/lista";
	}

}
