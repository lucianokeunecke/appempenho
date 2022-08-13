package br.edu.infnet.appempenho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConcorrenciaController {
	
	@GetMapping("/concorrencia/lista")
	public String telaLista() {
		return "concorrencia/lista";
	}

}
