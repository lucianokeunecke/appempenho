package br.edu.infnet.appempenho;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.Concorrencia;

@Component
@Order(3)
public class ConcorrenciaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("==========================================================");
		System.out.println("#Concorrência");
		
		Concorrencia concorrencia1 = new Concorrencia();
		concorrencia1.setNumero(150);
		concorrencia1.setDataExpedicao(LocalDateTime.now());
		concorrencia1.setObjetoLicitacao("Contratação de empresa especializada para execução de serviço de capeamento asfáltico");
		concorrencia1.setValorEstimadoEdital(150000);
		concorrencia1.setEletronica(true);
		concorrencia1.setPrazoExecucao("30 dias");
		concorrencia1.setValorMinimoCapital(500000);		
		System.out.println(concorrencia1);	
		
		Concorrencia concorrencia2 = new Concorrencia();
		concorrencia2.setNumero(153);
		concorrencia2.setDataExpedicao(LocalDateTime.now());
		concorrencia2.setObjetoLicitacao("Contratação de empresa especializada para execução de serviço de engenharia");
		concorrencia2.setValorEstimadoEdital(250000);
		concorrencia2.setEletronica(false);
		concorrencia2.setPrazoExecucao("45 dias");
		concorrencia2.setValorMinimoCapital(700000);		
		System.out.println(concorrencia2);	
		
		Concorrencia concorrencia3 = new Concorrencia();
		concorrencia3.setNumero(150);
		concorrencia3.setDataExpedicao(LocalDateTime.now());
		concorrencia3.setObjetoLicitacao("Contratação de empresa especializada para execução de obra");
		concorrencia3.setValorEstimadoEdital(470000);
		concorrencia3.setEletronica(true);
		concorrencia3.setPrazoExecucao("1 ano e 2 meses");
		concorrencia3.setValorMinimoCapital(1000000);		
		System.out.println(concorrencia3);	
		
	}

}
