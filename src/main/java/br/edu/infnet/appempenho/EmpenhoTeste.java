package br.edu.infnet.appempenho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
import br.edu.infnet.appempenho.model.exception.CnpjCpfInvalidoException;
import br.edu.infnet.appempenho.model.exception.EmpenhoSemProcessoLicitatorioException;
import br.edu.infnet.appempenho.model.exception.FornecedorNuloException;

@Component
@Order(1)
public class EmpenhoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		
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
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "Empenhos.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				while(linha != null) {

					try {
						
						String[] campos = linha.split(";");
						
						Set<ProcessoLicitatorio> listaProcessosLicitatorios1 = new HashSet<ProcessoLicitatorio>();
						listaProcessosLicitatorios1.add(concorrencia1);
						listaProcessosLicitatorios1.add(concorrencia2);
						listaProcessosLicitatorios1.add(pregao1);
						listaProcessosLicitatorios1.add(concorrencia1);
						listaProcessosLicitatorios1.add(concorrencia2);
						listaProcessosLicitatorios1.add(pregao1);
						listaProcessosLicitatorios1.add(tomadaPreco1);
						
						Fornecedor fornecedor1 = new Fornecedor(Integer.parseInt(campos[3]), campos[4], Long.parseLong(campos[5])); 
						
						Empenho empenho1 = new Empenho(fornecedor1, listaProcessosLicitatorios1);
						empenho1.setNumero(Integer.parseInt(campos[0]));
						empenho1.setValor(Float.parseFloat(campos[2]));
						EmpenhoController.incluir(empenho1);
					} catch (CnpjCpfInvalidoException | FornecedorNuloException | EmpenhoSemProcessoLicitatorioException e) {
						System.out.println("[ERROR - EMPENHO] " + e.getMessage());
					}
					
					linha = leitura.readLine();
				}
				
				leitura.close();
				
				fileReader.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe");
			} catch (IOException e) {
				System.out.println("[ERRO] Problema no fechamento do arquivo");
			}
		} finally {
			System.out.println("Terminou!!!");
		}
		
	}
}
