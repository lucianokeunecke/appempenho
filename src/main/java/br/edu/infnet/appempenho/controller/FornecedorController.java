package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.FornecedorService;

@Controller
public class FornecedorController {
	
	@Autowired
	private FornecedorService fornecedorService;
	
	private String mensagem;
	private String tipoMensagem;
	
	@GetMapping("/fornecedor/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		
		model.addAttribute("listagem", fornecedorService.obterLista(usuario));
		
		model.addAttribute("mensagem", mensagem);
		model.addAttribute("tipoMensagem", tipoMensagem);
		
		return "fornecedor/lista";
	}
	
	@GetMapping(value = "/fornecedor")
	public String telaCadastro() {
		
		return "fornecedor/cadastro";
	}
	
	@PostMapping(value = "fornecedor/incluir")
	public String incluir(Fornecedor fornecedor, @SessionAttribute("user") Usuario usuario) {
		
		fornecedor.setUsuario(usuario);
		
		fornecedorService.incluir(fornecedor);
		
		mensagem = "Inclusão do Fornecedor " + fornecedor.getNome() + " realizado com sucesso";
		tipoMensagem = "alert-success";
		
		return "redirect:/fornecedor/lista";
	}
	
	@GetMapping(value = "/fornecedor/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {
			fornecedorService.excluir(id);
			
			mensagem = "Exclusão do Fornecedor " + id + " realizada com sucesso";
			tipoMensagem = "alert-success";
		} catch (Exception e) {
			mensagem = "Impossível realizar a exclusão do Fornecedor " + id;
			tipoMensagem = "alert-danger";
		}
		
		return "redirect:/fornecedor/lista";
	}
	
}
