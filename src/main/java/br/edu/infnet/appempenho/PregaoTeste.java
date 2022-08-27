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

import br.edu.infnet.appempenho.controller.PregaoController;
import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.exception.IndiceReajusteZeradoNegativoException;

@Component
@Order(4)
public class PregaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println("====================================================================================================================");
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "Pregao.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				while(linha != null) {

					try {
						String[] campos = linha.split(";");
						
						Pregao pregao = new Pregao();
						pregao.setNumero(Integer.parseInt(campos[3]));
						pregao.setDataExpedicao(LocalDateTime.now());
						pregao.setObjetoLicitacao(campos[5]);
						pregao.setValorEstimadoEdital(550000);
						pregao.setRegistroPreco(Boolean.parseBoolean(campos[0]));
						pregao.setCriterioJulgamento(campos[1]);
						pregao.setIndiceReajuste(Float.parseFloat(campos[2]));		
						System.out.println("Valor Estimado do Edital R$ " + pregao.calcularValorEstimadoEdital());
						PregaoController.incluir(pregao);
					} catch (IndiceReajusteZeradoNegativoException e) {
						System.out.println("[ERROR - PREGAO] " + e.getMessage());
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
