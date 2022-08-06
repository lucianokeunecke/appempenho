package br.edu.infnet.appempenho;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.TomadaPreco;

@Component
@Order(5)
public class TomadaPrecoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("==========================================================");
		System.out.println("#Tomada de Preço");
		
		TomadaPreco tomadaPreco1 = new TomadaPreco();
		tomadaPreco1.setPermiteSubcontratacao(false);
		tomadaPreco1.setCondicaoPagamento("30/60/90 dias");
		tomadaPreco1.setValorEstimadoDotacaoOrcamentaria(150000);		
		System.out.println(tomadaPreco1);		
		
		TomadaPreco tomadaPreco2 = new TomadaPreco();
		tomadaPreco2.setPermiteSubcontratacao(true);
		tomadaPreco2.setCondicaoPagamento("15/30/45/60 dias");
		tomadaPreco2.setValorEstimadoDotacaoOrcamentaria(350000);		
		System.out.println(tomadaPreco2);		
		
		TomadaPreco tomadaPreco3 = new TomadaPreco();
		tomadaPreco3.setPermiteSubcontratacao(false);
		tomadaPreco3.setCondicaoPagamento("45/90 dias");
		tomadaPreco3.setValorEstimadoDotacaoOrcamentaria(175000);		
		System.out.println(tomadaPreco3);		
		
	}

}
