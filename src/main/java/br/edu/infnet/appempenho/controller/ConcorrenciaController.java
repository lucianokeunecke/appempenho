package br.edu.infnet.appempenho.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Controller
public class ConcorrenciaController {
	
	private static List<Concorrencia> listaConcorrencia = null;
	
	@GetMapping("/concorrencia/lista")
	public String telaLista(Model model) {
		
		Concorrencia concorrencia1 = new Concorrencia();
		concorrencia1.setNumero(150);
		concorrencia1.setDataExpedicao(LocalDateTime.now());
		concorrencia1.setObjetoLicitacao("Contratação de empresa especializada para execução de serviço de capeamento asfáltico");
		concorrencia1.setValorEstimadoEdital(150000);
		concorrencia1.setEletronica(true);
		concorrencia1.setPrazoExecucao("30 dias");
		concorrencia1.setValorMinimoCapital(500000);
		
		Concorrencia concorrencia2 = new Concorrencia();
		concorrencia2.setNumero(153);
		concorrencia2.setDataExpedicao(LocalDateTime.now());
		concorrencia2.setObjetoLicitacao("Contratação de empresa especializada para execução de serviço de engenharia");
		concorrencia2.setValorEstimadoEdital(250000);
		concorrencia2.setEletronica(false);
		concorrencia2.setPrazoExecucao("45 dias");
		concorrencia2.setValorMinimoCapital(700000);		
		
		Concorrencia concorrencia3 = new Concorrencia();
		concorrencia3.setNumero(175);
		concorrencia3.setDataExpedicao(LocalDateTime.now());
		concorrencia3.setObjetoLicitacao("Contratação de empresa especializada para execução de obra");
		concorrencia3.setValorEstimadoEdital(470000);
		concorrencia3.setEletronica(true);
		concorrencia3.setPrazoExecucao("1 ano e 2 meses");
		concorrencia3.setValorMinimoCapital(1000000);
		
		listaConcorrencia = new ArrayList<Concorrencia>();
		
		listaConcorrencia.add(concorrencia1);
		listaConcorrencia.add(concorrencia2);
		listaConcorrencia.add(concorrencia3);
		
		model.addAttribute("listagem", listaConcorrencia);
		
		return "concorrencia/lista";
	}

}
