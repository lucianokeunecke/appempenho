package br.edu.infnet.appempenho.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Controller
public class ConcorrenciaController {
	
	private static Map<Integer, Concorrencia> mapaConcorrencia = new HashMap<Integer, Concorrencia>();
	
	private static Integer id = 1;
	
	public static void incluir(Concorrencia concorrencia) {
		
		concorrencia.setId(id++);
		
		mapaConcorrencia.put(concorrencia.getId(), concorrencia);
		
		AppImpressao.relatorio("Inclusão da Concorrência Nº " + concorrencia.getNumero(), concorrencia);
	}
	
	public static void excluir(Integer id) {
		mapaConcorrencia.remove(id);
	}
	
	public static Collection<Concorrencia> obterLista(){
		return mapaConcorrencia.values();
	}	
	
	@GetMapping("/concorrencia/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", obterLista());
		
		return "concorrencia/lista";
	}
	
	@GetMapping("/concorrencia/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/concorrencia/lista";
	}

}
