package br.edu.infnet.appempenho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.service.FornecedorService;

@Controller
public class FornecedorController {
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping("/fornecedor/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", fornecedorService.obterLista());
		
		return "fornecedor/lista";
	}
	
	@GetMapping(value = "/fornecedor")
	public String telaCadastro() {
		
		return "fornecedor/cadastro";
	}
	
	@PostMapping(value = "fornecedor/incluir")
	public String incluir(Fornecedor fornecedor) {
		
		fornecedorService.incluir(fornecedor);
		
		return "redirect:/fornecedor/lista";
	}
	
	@GetMapping(value = "/fornecedor/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		fornecedorService.excluir(id);
		
		return "redirect:/fornecedor/lista";
	}
	
}
