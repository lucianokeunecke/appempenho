package br.edu.infnet.appempenho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TomadaPrecoController {
	
	@GetMapping("/tomadaPreco/lista")
	public String telaLista() {
		return "tomadaPreco/lista";
	}	

}
