package br.edu.infnet.appempenho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProcessoLicitatorioController {
	
	@GetMapping("/processoLicitatorio/lista")
	public String telaLista() {
		return "processoLicitatorio/lista";
	}	

}
