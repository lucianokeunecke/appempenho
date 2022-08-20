package br.edu.infnet.appempenho.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Controller
public class ConcorrenciaController {
	
	private static List<Concorrencia> listaConcorrencia = new ArrayList<Concorrencia>();
	
	public static void incluir(Concorrencia concorrencia) {
		
		listaConcorrencia.add(concorrencia);
		
		AppImpressao.relatorio("Inclusão da Concorrência Nº " + concorrencia.getNumero(), concorrencia);
	}
	
	@GetMapping("/concorrencia/lista")
	public String telaLista(Model model) {
		
		
		model.addAttribute("listagem", listaConcorrencia);
		
		return "concorrencia/lista";
	}

}
