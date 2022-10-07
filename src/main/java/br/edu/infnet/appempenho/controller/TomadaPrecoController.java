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
	
	private String mensagem;
	private String tipoMensagem;
	
	@GetMapping("/tomadaPreco/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		
		model.addAttribute("listagem", tomadaPrecoService.obterLista(usuario));
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipoMensagem", tipoMensagem);
		
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
		
		mensagem = "Inclusão da Tomada de Preço Nº " + tomadaPreco.getNumero() + " realizado com sucesso";
		tipoMensagem = "alert-success";
		
		return "redirect:/tomadaPreco/lista";
	}	
	
	@GetMapping("/tomadaPreco/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {
			tomadaPrecoService.excluir(id);
			
			mensagem = "Exclusão da Tomada de Preço " + id + " realizada com sucesso";
			tipoMensagem = "alert-success";
		} catch (Exception e) {
			mensagem = "Impossível realizar a exclusão da Tomada de Preço " + id;
			tipoMensagem = "alert-danger";
		}
		
		return "redirect:/tomadaPreco/lista";
	}	

}
