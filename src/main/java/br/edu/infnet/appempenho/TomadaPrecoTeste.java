package br.edu.infnet.appempenho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "TomadaPreco.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				while(linha != null) {

					try {						
						String[] campos = linha.split(";");
						
						TomadaPreco tomadaPreco = new TomadaPreco();
						tomadaPreco.setNumero(Integer.parseInt(campos[3]));
						tomadaPreco.setDataExpedicao(LocalDateTime.now());
						tomadaPreco.setObjetoLicitacao(campos[5]);
						tomadaPreco.setValorEstimadoEdital(200000);
						tomadaPreco.setPermiteSubcontratacao(Boolean.parseBoolean(campos[0]));
						tomadaPreco.setCondicaoPagamento(campos[1]);
						tomadaPreco.setValorEstimadoDotacaoOrcamentaria(Float.parseFloat(campos[2]));
						System.out.println("Valor Estimado do Edital R$ " + tomadaPreco.calcularValorEstimadoEdital());
						TomadaPrecoController.incluir(tomadaPreco);
					} catch (ValorEstimadoDotacaoOrcamentariaException e) {
						System.out.println("[ERROR - TOMADA DE PRECO] " + e.getMessage());
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
