package br.edu.infnet.appempenho;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;

@Component
@Order(5)
public class TomadaPrecoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("==========================================================");
		System.out.println("#Tomada de Preço");
		
		TomadaPreco tomadaPreco1 = new TomadaPreco();
		tomadaPreco1.setNumero(750);
		tomadaPreco1.setDataExpedicao(LocalDateTime.now());
		tomadaPreco1.setObjetoLicitacao("Contratação de empresa especializada em serviço de limpeza");
		tomadaPreco1.permiteSubcontratacao = false;
		tomadaPreco1.condicaoPagamento = "30/60/90 dias";
		tomadaPreco1.valorEstimadoDotacaoOrcamentaria = 150000;		
		System.out.println(tomadaPreco1);		
		
		TomadaPreco tomadaPreco2 = new TomadaPreco();
		tomadaPreco2.setNumero(755);
		tomadaPreco2.setDataExpedicao(LocalDateTime.now());
		tomadaPreco2.setObjetoLicitacao("Contratação de exames laboratoriais");
		tomadaPreco2.permiteSubcontratacao = true;
		tomadaPreco2.condicaoPagamento = "15/30/45/60 dias";
		tomadaPreco2.valorEstimadoDotacaoOrcamentaria = 350000;		
		System.out.println(tomadaPreco2);		
		
		TomadaPreco tomadaPreco3 = new TomadaPreco();
		tomadaPreco3.setNumero(796);
		tomadaPreco3.setDataExpedicao(LocalDateTime.now());
		tomadaPreco3.setObjetoLicitacao("Contratação de empresa especializada em serviços de contrução civil");
		tomadaPreco3.permiteSubcontratacao = false;
		tomadaPreco3.condicaoPagamento = "45/90 dias";
		tomadaPreco3.valorEstimadoDotacaoOrcamentaria = 175000;		
		System.out.println(tomadaPreco3);		
		
	}
}
