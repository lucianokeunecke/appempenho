package br.edu.infnet.appempenho;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.controller.ConcorrenciaController;
import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.exception.ValorMinimoCapitalInvalidoException;

@Component
@Order(3)
public class ConcorrenciaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println("====================================================================================================================");
		
		try {
			Concorrencia concorrencia1 = new Concorrencia();
			concorrencia1.setNumero(150);
			concorrencia1.setDataExpedicao(LocalDateTime.now());
			concorrencia1.setObjetoLicitacao("Contratação de empresa especializada para execução de serviço de capeamento asfáltico");
			concorrencia1.setValorEstimadoEdital(150000);
			concorrencia1.setEletronica(true);
			concorrencia1.setPrazoExecucao("30 dias");
			concorrencia1.setValorMinimoCapital(500000);
			System.out.println("Valor Estimado do Edital R$ " + concorrencia1.calcularValorEstimadoEdital());
			ConcorrenciaController.incluir(concorrencia1);
		} catch (ValorMinimoCapitalInvalidoException e) {
			System.out.println("[ERROR - CONCORRENCIA] " + e.getMessage());
		}
		
		try {
			Concorrencia concorrencia2 = new Concorrencia();
			concorrencia2.setNumero(153);
			concorrencia2.setDataExpedicao(LocalDateTime.now());
			concorrencia2.setObjetoLicitacao("Contratação de empresa especializada para execução de serviço de engenharia");
			concorrencia2.setValorEstimadoEdital(250000);
			concorrencia2.setEletronica(false);
			concorrencia2.setPrazoExecucao("45 dias");
			concorrencia2.setValorMinimoCapital(700000);		
			System.out.println("Valor Estimado do Edital R$ " + concorrencia2.calcularValorEstimadoEdital());
			ConcorrenciaController.incluir(concorrencia2);
		} catch (ValorMinimoCapitalInvalidoException e) {
			System.out.println("[ERROR - CONCORRENCIA] " + e.getMessage());
		}
		
		try {
			Concorrencia concorrencia3 = new Concorrencia();
			concorrencia3.setNumero(175);
			concorrencia3.setDataExpedicao(LocalDateTime.now());
			concorrencia3.setObjetoLicitacao("Contratação de empresa especializada para execução de obra");
			concorrencia3.setValorEstimadoEdital(470000);
			concorrencia3.setEletronica(true);
			concorrencia3.setPrazoExecucao("1 ano e 2 meses");
			concorrencia3.setValorMinimoCapital(1000000);		
			System.out.println("Valor Estimado do Edital R$ " + concorrencia3.calcularValorEstimadoEdital());
			ConcorrenciaController.incluir(concorrencia3);
		} catch (ValorMinimoCapitalInvalidoException e) {
			System.out.println("[ERROR - CONCORRENCIA] " + e.getMessage());
		}
		
		try {
			Concorrencia concorrencia4 = new Concorrencia();
			concorrencia4.setNumero(175);
			concorrencia4.setDataExpedicao(LocalDateTime.now());
			concorrencia4.setObjetoLicitacao("Contratação de empresa especializada para execução de obra");
			concorrencia4.setValorEstimadoEdital(470000);
			concorrencia4.setEletronica(true);
			concorrencia4.setPrazoExecucao("1 ano e 2 meses");
			concorrencia4.setValorMinimoCapital(49000);		
			System.out.println("Valor Estimado do Edital R$ " + concorrencia4.calcularValorEstimadoEdital());
			ConcorrenciaController.incluir(concorrencia4);
		} catch (ValorMinimoCapitalInvalidoException e) {
			System.out.println("[ERROR - CONCORRENCIA] " + e.getMessage());
		}
		
	}

}
