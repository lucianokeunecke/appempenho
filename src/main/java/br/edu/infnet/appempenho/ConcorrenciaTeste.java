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

import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.exception.ValorMinimoCapitalInvalidoException;
import br.edu.infnet.appempenho.model.service.ConcorrenciaService;

@Component
@Order(3)
public class ConcorrenciaTeste implements ApplicationRunner {
	
	@Autowired
	private ConcorrenciaService concorrenciaService;

	@Override
	public void run(ApplicationArguments args) {
		
		System.out.println("");
		System.out.println("====================================================================================================================");
		System.out.println("********************************************** CONCORRENCIA ********************************************************");
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
					
					if ("c".equalsIgnoreCase(campos[0])) {
						try {						
							Concorrencia concorrencia = new Concorrencia();
							concorrencia.setNumero(Integer.parseInt(campos[4]));
							concorrencia.setDataExpedicao(LocalDate.now());
							concorrencia.setObjetoLicitacao(campos[6]);
							concorrencia.setEletronica(Boolean.parseBoolean(campos[1]));
							concorrencia.setPrazoExecucao(campos[2]);
							concorrencia.setValorMinimoCapital(Float.parseFloat(campos[3]));
							concorrencia.setValorEstimadoEdital(Float.parseFloat(campos[7]));
							concorrencia.setUsuario(usuario);
							System.out.println("Valor Estimado do Edital R$ " + concorrencia.calcularValorEstimadoEdital());
							concorrenciaService.incluir(concorrencia);
						} catch (ValorMinimoCapitalInvalidoException e) {
							System.out.println("[ERROR - CONCORRENCIA] " + e.getMessage());
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
