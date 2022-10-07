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
	
	private String mensagem;
	private String tipoMensagem;
	
	@GetMapping("/concorrencia/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		
		model.addAttribute("listagem", concorrenciaService.obterLista(usuario));
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipoMensagem", tipoMensagem);
		
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
		
		mensagem = "Inclusão da Concorrência Nº " + concorrencia.getNumero() + " realizada com sucesso";
		tipoMensagem = "alert-success";
		
		return "redirect:/concorrencia/lista";
	}		
	
	@GetMapping("/concorrencia/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {
			concorrenciaService.excluir(id);
			
			mensagem = "Exclusão da Concorrência " + id + " realizada com sucesso";
			tipoMensagem = "alert-success";
		} catch (Exception e) {
			mensagem = "Impossível realizar a exclusão da Concorrência " + id;
			tipoMensagem = "alert-danger";
		}
		
		return "redirect:/concorrencia/lista";
	}

}
