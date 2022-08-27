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

import br.edu.infnet.appempenho.controller.ConcorrenciaController;
import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.exception.ValorMinimoCapitalInvalidoException;

@Component
@Order(3)
public class ConcorrenciaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println("====================================================================================================================");
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "concorrencia.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				while(linha != null) {

					try {						
						String[] campos = linha.split(";");
						
						Concorrencia concorrencia1 = new Concorrencia();
						concorrencia1.setNumero(Integer.parseInt(campos[3]));
						concorrencia1.setDataExpedicao(LocalDateTime.now());
						concorrencia1.setObjetoLicitacao(campos[5]);
						concorrencia1.setEletronica(Boolean.parseBoolean(campos[0]));
						concorrencia1.setPrazoExecucao(campos[1]);
						concorrencia1.setValorMinimoCapital(Float.parseFloat(campos[2]));
						System.out.println("Valor Estimado do Edital R$ " + concorrencia1.calcularValorEstimadoEdital());
						ConcorrenciaController.incluir(concorrencia1);
					} catch (ValorMinimoCapitalInvalidoException e) {
						System.out.println("[ERROR - CONCORRENCIA] " + e.getMessage());
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
