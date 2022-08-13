package br.edu.infnet.appempenho;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;
import br.edu.infnet.appempenho.model.test.AppProcessoLicitatorio;

@Component
@Order(5)
public class TomadaPrecoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("==========================================================");
		
		TomadaPreco tomadaPreco1 = new TomadaPreco();
		tomadaPreco1.setNumero(750);
		tomadaPreco1.setDataExpedicao(LocalDateTime.now());
		tomadaPreco1.setObjetoLicitacao("Contratação de empresa especializada em serviço de limpeza");
		tomadaPreco1.setValorEstimadoEdital(200000);
		tomadaPreco1.setPermiteSubcontratacao(false);
		tomadaPreco1.setCondicaoPagamento("30/60/90 dias");
		tomadaPreco1.setValorEstimadoDotacaoOrcamentaria(150000);		
		AppProcessoLicitatorio.relatorio("Inclusão da Tomada de Preço Nº " + tomadaPreco1.getNumero(), tomadaPreco1);
		
		TomadaPreco tomadaPreco2 = new TomadaPreco();
		tomadaPreco2.setNumero(755);
		tomadaPreco2.setDataExpedicao(LocalDateTime.now());
		tomadaPreco2.setObjetoLicitacao("Contratação de exames laboratoriais");
		tomadaPreco2.setValorEstimadoEdital(290000);
		tomadaPreco2.setPermiteSubcontratacao(true);
		tomadaPreco2.setCondicaoPagamento("15/30/45/60 dias");
		tomadaPreco2.setValorEstimadoDotacaoOrcamentaria(350000);		
		AppProcessoLicitatorio.relatorio("Inclusão da Tomada de Preço Nº " + tomadaPreco2.getNumero(), tomadaPreco2);
		
		TomadaPreco tomadaPreco3 = new TomadaPreco();
		tomadaPreco3.setNumero(796);
		tomadaPreco3.setDataExpedicao(LocalDateTime.now());
		tomadaPreco3.setObjetoLicitacao("Contratação de empresa especializada em serviços de contrução civil");
		tomadaPreco3.setValorEstimadoEdital(740500);
		tomadaPreco3.setPermiteSubcontratacao(false);
		tomadaPreco3.setCondicaoPagamento("45/90 dias");
		tomadaPreco3.setValorEstimadoDotacaoOrcamentaria(175000);		
		AppProcessoLicitatorio.relatorio("Inclusão da Tomada de Preço Nº " + tomadaPreco3.getNumero(), tomadaPreco3);
		
	}
}
