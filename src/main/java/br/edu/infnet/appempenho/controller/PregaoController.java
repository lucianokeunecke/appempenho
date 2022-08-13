package br.edu.infnet.appempenho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PregaoController {
	
	@GetMapping("/pregao/lista")
	public String telaLista() {
		return "pregao/lista";
	}	

}
