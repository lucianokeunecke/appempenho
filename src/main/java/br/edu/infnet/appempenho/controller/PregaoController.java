package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.PregaoService;

@Controller
public class PregaoController {
	
	@Autowired
	private PregaoService pregaoService;	
	
	private String mensagem;
	private String tipoMensagem;
	
	@GetMapping("/pregao/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		
		model.addAttribute("listagem", pregaoService.obterLista(usuario));
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipoMensagem", tipoMensagem);
		
		return "pregao/lista";
	}	
	
	@GetMapping(value = "/pregao")
	public String telaCadastro() {
		
		return "pregao/cadastro";
	}	
	
	@PostMapping(value = "pregao/incluir")
	public String incluir(Pregao pregao, @SessionAttribute("user") Usuario usuario) {
		
		pregao.setUsuario(usuario);
		
		pregaoService.incluir(pregao);
		
		mensagem = "Inclusão do Pregão Nº " + pregao.getNumero() + " realizado com sucesso";
		tipoMensagem = "alert-success";
		
		return "redirect:/pregao/lista";
	}	
	
	@GetMapping("/pregao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {
			pregaoService.excluir(id);
			
			mensagem = "Exclusão do Pregão " + id + " realizado com sucesso";
			tipoMensagem = "alert-success";
		} catch (Exception e) {
			mensagem = "Impossível realizar a exclusão do Pregão " + id;
			tipoMensagem = "alert-danger";
		}
		
		return "redirect:/pregao/lista";
	}	

}
