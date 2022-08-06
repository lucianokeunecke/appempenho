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
		concorrencia1.numero = 150;
		concorrencia1.dataExpedicao = LocalDateTime.now();
		concorrencia1.objetoLicitacao = "Contratação de empresa especializada para execução de serviço de capeamento asfáltico";
		concorrencia1.eletronica = true;
		concorrencia1.prazoExecucao = "30 dias";
		concorrencia1.valorMinimoCapital = 500000;		
		System.out.println(concorrencia1);	
		
		Concorrencia concorrencia2 = new Concorrencia();
		concorrencia2.numero = 153;
		concorrencia2.dataExpedicao = LocalDateTime.now();
		concorrencia2.objetoLicitacao = "Contratação de empresa especializada para execução de serviço de engenharia";
		concorrencia2.eletronica = false;
		concorrencia2.prazoExecucao = "45 dias";
		concorrencia2.valorMinimoCapital = 700000;		
		System.out.println(concorrencia2);	
		
		Concorrencia concorrencia3 = new Concorrencia();
		concorrencia3.numero = 150;
		concorrencia3.dataExpedicao = LocalDateTime.now();
		concorrencia3.objetoLicitacao = "Contratação de empresa especializada para execução de obra";
		concorrencia3.eletronica = true;
		concorrencia3.prazoExecucao = "1 ano e 2 meses";
		concorrencia3.valorMinimoCapital = 1000000;		
		System.out.println(concorrencia3);	
		
	}

}
