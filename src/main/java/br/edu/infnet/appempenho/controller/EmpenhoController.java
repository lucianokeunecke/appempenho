package br.edu.infnet.appempenho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpenhoController {
	
	@GetMapping("/empenho/lista")
	public String telaLista() {
		return "empenho/lista";
	}		

}
