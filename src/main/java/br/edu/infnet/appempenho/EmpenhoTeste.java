package br.edu.infnet.appempenho;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.controller.EmpenhoController;
import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.domain.Empenho;
import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.domain.ProcessoLicitatorio;
import br.edu.infnet.appempenho.model.domain.TomadaPreco;

@Component
@Order(1)
public class EmpenhoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Concorrencia concorrencia1 = new Concorrencia();
		concorrencia1.setNumero(150);
		concorrencia1.setDataExpedicao(LocalDateTime.now());
		concorrencia1.setObjetoLicitacao("Contratação de empresa especializada para execução de serviço de capeamento asfáltico");
		concorrencia1.setValorEstimadoEdital(150000);
		concorrencia1.setEletronica(true);
		concorrencia1.setPrazoExecucao("30 dias");
		concorrencia1.setValorMinimoCapital(500000);
		
		Concorrencia concorrencia2 = new Concorrencia();
		concorrencia2.setNumero(151);
		concorrencia2.setDataExpedicao(LocalDateTime.now());
		concorrencia2.setObjetoLicitacao("Contratação de empresa especializada para execução de serviço de capeamento asfáltico");
		concorrencia2.setValorEstimadoEdital(150000);
		concorrencia2.setEletronica(true);
		concorrencia2.setPrazoExecucao("30 dias");
		concorrencia2.setValorMinimoCapital(500000);		
		
		Pregao pregao1 = new Pregao();
		pregao1.setNumero(152);
		pregao1.setDataExpedicao(LocalDateTime.now());
		pregao1.setObjetoLicitacao("Contratação de materiais de consumo");
		pregao1.setValorEstimadoEdital(550000);
		pregao1.setRegistroPreco(true);
		pregao1.setCriterioJulgamento("Menor Preço");
		pregao1.setIndiceReajuste(1.5f);		

		TomadaPreco tomadaPreco1 = new TomadaPreco();
		tomadaPreco1.setNumero(153);
		tomadaPreco1.setDataExpedicao(LocalDateTime.now());
		tomadaPreco1.setObjetoLicitacao("Contratação de empresa especializada em serviço de limpeza");
		tomadaPreco1.setValorEstimadoEdital(200000);
		tomadaPreco1.setPermiteSubcontratacao(false);
		tomadaPreco1.setCondicaoPagamento("30/60/90 dias");
		tomadaPreco1.setValorEstimadoDotacaoOrcamentaria(150000);	

		System.out.println("====================================================================================================================");
		
		Set<ProcessoLicitatorio> listaProcessosLicitatorios1 = new HashSet<ProcessoLicitatorio>();
		listaProcessosLicitatorios1.add(concorrencia1);
		listaProcessosLicitatorios1.add(concorrencia2);
		listaProcessosLicitatorios1.add(pregao1);
		listaProcessosLicitatorios1.add(concorrencia1);
		listaProcessosLicitatorios1.add(concorrencia2);
		listaProcessosLicitatorios1.add(pregao1);
		listaProcessosLicitatorios1.add(tomadaPreco1);
		
		Empenho empenho1 = new Empenho(new Fornecedor(15, "Luciano Keunecke", 3189734992L));
		empenho1.setNumero(476);
		empenho1.setValor(5000);
		empenho1.setListaProcessosLicitatorios(listaProcessosLicitatorios1);
		EmpenhoController.incluir(empenho1);
		
		
		
		Set<ProcessoLicitatorio> listaProcessosLicitatorios2 = new HashSet<ProcessoLicitatorio>();
		listaProcessosLicitatorios2.add(concorrencia1);
		listaProcessosLicitatorios2.add(tomadaPreco1);
		
		Empenho empenho2 = new Empenho(new Fornecedor(96, "Governança Brasil", 4983932000152L));
		empenho2.setNumero(843);
		empenho2.setValor(6500);		
		empenho2.setListaProcessosLicitatorios(listaProcessosLicitatorios2);
		EmpenhoController.incluir(empenho2);

		
		
		Set<ProcessoLicitatorio> listaProcessosLicitatorios3 = new HashSet<ProcessoLicitatorio>();
		listaProcessosLicitatorios3.add(pregao1);
		listaProcessosLicitatorios3.add(tomadaPreco1);
		listaProcessosLicitatorios3.add(concorrencia1);
		
		Empenho empenho3 = new Empenho(new Fornecedor(175, "Eletrônica Blumenau", 78642321000192L));
		empenho3.setNumero(974);
		empenho3.setValor(2700);		
		empenho3.setListaProcessosLicitatorios(listaProcessosLicitatorios3);
		EmpenhoController.incluir(empenho3);
	}

}
