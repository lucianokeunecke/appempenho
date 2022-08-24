package br.edu.infnet.appempenho;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.controller.TomadaPrecoController;
import br.edu.infnet.appempenho.model.domain.TomadaPreco;
import br.edu.infnet.appempenho.model.exception.ValorEstimadoDotacaoOrcamentariaException;

@Component
@Order(5)
public class TomadaPrecoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println("====================================================================================================================");
		
		try {
			TomadaPreco tomadaPreco1 = new TomadaPreco();
			tomadaPreco1.setNumero(750);
			tomadaPreco1.setDataExpedicao(LocalDateTime.now());
			tomadaPreco1.setObjetoLicitacao("Contratação de empresa especializada em serviço de limpeza");
			tomadaPreco1.setValorEstimadoEdital(200000);
			tomadaPreco1.setPermiteSubcontratacao(false);
			tomadaPreco1.setCondicaoPagamento("30/60/90 dias");
			tomadaPreco1.setValorEstimadoDotacaoOrcamentaria(150000);
			System.out.println("Valor Estimado do Edital R$ " + tomadaPreco1.calcularValorEstimadoEdital());
			TomadaPrecoController.incluir(tomadaPreco1);
		} catch (ValorEstimadoDotacaoOrcamentariaException e) {
			System.out.println("[ERROR - TOMADA DE PRECO] " + e.getMessage());
		}
		
		try {
			TomadaPreco tomadaPreco2 = new TomadaPreco();
			tomadaPreco2.setNumero(755);
			tomadaPreco2.setDataExpedicao(LocalDateTime.now());
			tomadaPreco2.setObjetoLicitacao("Contratação de exames laboratoriais");
			tomadaPreco2.setValorEstimadoEdital(290000);
			tomadaPreco2.setPermiteSubcontratacao(true);
			tomadaPreco2.setCondicaoPagamento("15/30/45/60 dias");
			tomadaPreco2.setValorEstimadoDotacaoOrcamentaria(350000);		
			System.out.println("Valor Estimado do Edital R$ " + tomadaPreco2.calcularValorEstimadoEdital());
			TomadaPrecoController.incluir(tomadaPreco2);
		} catch (ValorEstimadoDotacaoOrcamentariaException e) {
			System.out.println("[ERROR - TOMADA DE PRECO] " + e.getMessage());
		}
		
		try {
			TomadaPreco tomadaPreco3 = new TomadaPreco();
			tomadaPreco3.setNumero(796);
			tomadaPreco3.setDataExpedicao(LocalDateTime.now());
			tomadaPreco3.setObjetoLicitacao("Contratação de empresa especializada em serviços de contrução civil");
			tomadaPreco3.setValorEstimadoEdital(740500);
			tomadaPreco3.setPermiteSubcontratacao(false);
			tomadaPreco3.setCondicaoPagamento("45/90 dias");
			tomadaPreco3.setValorEstimadoDotacaoOrcamentaria(175000);		
			System.out.println("Valor Estimado do Edital R$ " + tomadaPreco3.calcularValorEstimadoEdital());
			TomadaPrecoController.incluir(tomadaPreco3);
		} catch (ValorEstimadoDotacaoOrcamentariaException e) {
			System.out.println("[ERROR - TOMADA DE PRECO] " + e.getMessage());
		}
		
		try {
			TomadaPreco tomadaPreco4 = new TomadaPreco();
			tomadaPreco4.setNumero(796);
			tomadaPreco4.setDataExpedicao(LocalDateTime.now());
			tomadaPreco4.setObjetoLicitacao("Contratação de empresa especializada em serviços de contrução civil");
			tomadaPreco4.setValorEstimadoEdital(740500);
			tomadaPreco4.setPermiteSubcontratacao(false);
			tomadaPreco4.setCondicaoPagamento("45/90 dias");
			tomadaPreco4.setValorEstimadoDotacaoOrcamentaria(-10);		
			System.out.println("Valor Estimado do Edital R$ " + tomadaPreco4.calcularValorEstimadoEdital());
			TomadaPrecoController.incluir(tomadaPreco4);
		} catch (ValorEstimadoDotacaoOrcamentariaException e) {
			System.out.println("[ERROR - TOMADA DE PRECO] " + e.getMessage());
		}
		
		try {
			TomadaPreco tomadaPreco5 = new TomadaPreco();
			tomadaPreco5.setNumero(796);
			tomadaPreco5.setDataExpedicao(LocalDateTime.now());
			tomadaPreco5.setObjetoLicitacao("Contratação de empresa especializada em serviços de contrução civil");
			tomadaPreco5.setValorEstimadoEdital(740500);
			tomadaPreco5.setPermiteSubcontratacao(false);
			tomadaPreco5.setCondicaoPagamento("45/90 dias");
			tomadaPreco5.setValorEstimadoDotacaoOrcamentaria(501000);		
			System.out.println("Valor Estimado do Edital R$ " + tomadaPreco5.calcularValorEstimadoEdital());
			TomadaPrecoController.incluir(tomadaPreco5);
		} catch (ValorEstimadoDotacaoOrcamentariaException e) {
			System.out.println("[ERROR - TOMADA DE PRECO] " + e.getMessage());
		}
		
	}
}
