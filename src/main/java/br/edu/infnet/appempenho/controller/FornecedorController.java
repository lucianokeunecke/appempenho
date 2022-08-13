package br.edu.infnet.appempenho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FornecedorController {
	
	@GetMapping("/fornecedor/lista")
	public String telaLista() {
		return "fornecedor/lista";
	}		

}
