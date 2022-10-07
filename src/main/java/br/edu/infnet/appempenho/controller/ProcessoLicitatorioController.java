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
	
	private String mensagem;
	private String tipoMensagem;
	
	@GetMapping("/processoLicitatorio/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		
		model.addAttribute("listagem", processoLicitatorioService.obterLista(usuario));
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipoMensagem", tipoMensagem);
		
		return "processoLicitatorio/lista";
	}
	
	@GetMapping("/processoLicitatorio/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {
			processoLicitatorioService.excluir(id);
			
			mensagem = "Exclusão do Processo Licitatório " + id + " realizado com sucesso";
			tipoMensagem = "alert-success";
		} catch (Exception e) {
			mensagem = "Impossível realizar a exclusão do Processo Licitatório " + id;
			tipoMensagem = "alert-danger";
		}
		
		return "redirect:/processoLicitatorio/lista";
	}

}
