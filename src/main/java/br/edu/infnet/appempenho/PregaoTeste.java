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

import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.exception.IndiceReajusteZeradoNegativoException;
import br.edu.infnet.appempenho.model.service.PregaoService;

@Component
@Order(4)
public class PregaoTeste implements ApplicationRunner {
	
	@Autowired
	private PregaoService pregaoService;	

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println("");
		System.out.println("====================================================================================================================");
		System.out.println("************************************************* PREGAO ***********************************************************");
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
					
					if ("p".equalsIgnoreCase(campos[0])) {
						try {
							Pregao pregao = new Pregao();
							pregao.setNumero(Integer.parseInt(campos[4]));
							pregao.setDataExpedicao(LocalDate.now());
							pregao.setObjetoLicitacao(campos[6]);
							pregao.setValorEstimadoEdital(550000);
							pregao.setRegistroPreco(Boolean.parseBoolean(campos[1]));
							pregao.setCriterioJulgamento(campos[2]);
							pregao.setIndiceReajuste(Float.parseFloat(campos[3]));
							pregao.setUsuario(usuario);
							System.out.println("Valor Estimado do Edital R$ " + pregao.calcularValorEstimadoEdital());
							pregaoService.incluir(pregao);
						} catch (IndiceReajusteZeradoNegativoException e) {
							System.out.println("[ERROR - PREGAO] " + e.getMessage());
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
