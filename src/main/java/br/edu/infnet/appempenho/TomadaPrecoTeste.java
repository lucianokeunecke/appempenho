package br.edu.infnet.appempenho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.exception.ValorEstimadoDotacaoOrcamentariaException;
import br.edu.infnet.appempenho.model.service.TomadaPrecoService;

@Component
@Order(5)
public class TomadaPrecoTeste implements ApplicationRunner {
	
	@Autowired
	private TomadaPrecoService tomadaPrecoService;

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println("");
		System.out.println("====================================================================================================================");
		System.out.println("****************************************** TOMADA DE PRECO *********************************************************");
		System.out.println("====================================================================================================================");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "ProcessoLicitatorio.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					if ("t".equalsIgnoreCase(campos[0])) {
						try {						
							
							TomadaPreco tomadaPreco = new TomadaPreco();
							tomadaPreco.setNumero(Integer.parseInt(campos[4]));
							tomadaPreco.setDataExpedicao(LocalDate.now());
							tomadaPreco.setObjetoLicitacao(campos[6]);
							tomadaPreco.setValorEstimadoEdital(200000);
							tomadaPreco.setPermiteSubcontratacao(Boolean.parseBoolean(campos[1]));
							tomadaPreco.setCondicaoPagamento(campos[2]);
							tomadaPreco.setValorEstimadoDotacaoOrcamentaria(Float.parseFloat(campos[3]));
							tomadaPreco.setUsuario(usuario);
							System.out.println("Valor Estimado do Edital R$ " + tomadaPreco.calcularValorEstimadoEdital());
							tomadaPrecoService.incluir(tomadaPreco);
						} catch (ValorEstimadoDotacaoOrcamentariaException e) {
							System.out.println("[ERROR - TOMADA DE PRECO] " + e.getMessage());
						}
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
