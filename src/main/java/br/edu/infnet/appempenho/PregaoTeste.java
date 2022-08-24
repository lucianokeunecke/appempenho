package br.edu.infnet.appempenho;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.controller.PregaoController;
import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.exception.IndiceReajusteZeradoNegativoException;

@Component
@Order(4)
public class PregaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println("====================================================================================================================");
		
		try {
			Pregao pregao1 = new Pregao();
			pregao1.setNumero(356);
			pregao1.setDataExpedicao(LocalDateTime.now());
			pregao1.setObjetoLicitacao("Contratação de materiais de consumo");
			pregao1.setValorEstimadoEdital(550000);
			pregao1.setRegistroPreco(true);
			pregao1.setCriterioJulgamento("Menor Preço");
			pregao1.setIndiceReajuste(1.5f);		
			System.out.println("Valor Estimado do Edital R$ " + pregao1.calcularValorEstimadoEdital());
			PregaoController.incluir(pregao1);
		} catch (IndiceReajusteZeradoNegativoException e) {
			System.out.println("[ERROR - PREGAO] " + e.getMessage());
		}
		
		try {
			Pregao pregao2 = new Pregao();
			pregao2.setNumero(376);
			pregao2.setDataExpedicao(LocalDateTime.now());
			pregao2.setObjetoLicitacao("Contratação de materiais de expediente");
			pregao2.setValorEstimadoEdital(750000);
			pregao2.setRegistroPreco(false);
			pregao2.setCriterioJulgamento("Maior Desconto");
			pregao2.setIndiceReajuste(2.35f);		
			System.out.println("Valor Estimado do Edital R$ " + pregao2.calcularValorEstimadoEdital());
			PregaoController.incluir(pregao2);
		} catch (IndiceReajusteZeradoNegativoException e) {
			System.out.println("[ERROR - PREGAO] " + e.getMessage());
		}
		
		try {
			Pregao pregao3 = new Pregao();
			pregao3.setNumero(397);
			pregao3.setDataExpedicao(LocalDateTime.now());
			pregao3.setObjetoLicitacao("Contratação de materiais de escritório");
			pregao3.setValorEstimadoEdital(850000);
			pregao3.setRegistroPreco(false);
			pregao3.setCriterioJulgamento("Maior Lance ou Oferta");
			pregao3.setIndiceReajuste(0.75f);		
			System.out.println("Valor Estimado do Edital R$ " + pregao3.calcularValorEstimadoEdital());
			PregaoController.incluir(pregao3);
		} catch (IndiceReajusteZeradoNegativoException e) {
			System.out.println("[ERROR - PREGAO] " + e.getMessage());
		}
		
		try {
			Pregao pregao4 = new Pregao();
			pregao4.setNumero(397);
			pregao4.setDataExpedicao(LocalDateTime.now());
			pregao4.setObjetoLicitacao("Contratação de materiais de escritório");
			pregao4.setValorEstimadoEdital(850000);
			pregao4.setRegistroPreco(false);
			pregao4.setCriterioJulgamento("Maior Lance ou Oferta");
			//pregao4.setIndiceReajuste(1f);		
			System.out.println("Valor Estimado do Edital R$ " + pregao4.calcularValorEstimadoEdital());
			PregaoController.incluir(pregao4);
		} catch (IndiceReajusteZeradoNegativoException e) {
			System.out.println("[ERROR - PREGAO] " + e.getMessage());
		}
		
		try {
			Pregao pregao5 = new Pregao();
			pregao5.setNumero(397);
			pregao5.setDataExpedicao(LocalDateTime.now());
			pregao5.setObjetoLicitacao("Contratação de materiais de escritório");
			pregao5.setValorEstimadoEdital(850000);
			pregao5.setRegistroPreco(false);
			pregao5.setCriterioJulgamento("Maior Lance ou Oferta");
			pregao5.setIndiceReajuste(-0.05f);		
			System.out.println("Valor Estimado do Edital R$ " + pregao5.calcularValorEstimadoEdital());
			PregaoController.incluir(pregao5);
		} catch (IndiceReajusteZeradoNegativoException e) {
			System.out.println("[ERROR - PREGAO] " + e.getMessage());
		}
		
		
	}

}
