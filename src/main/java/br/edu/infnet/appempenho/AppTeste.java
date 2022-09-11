package br.edu.infnet.appempenho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.app.Atributo;
import br.edu.infnet.appempenho.model.domain.app.Classe;
import br.edu.infnet.appempenho.model.domain.app.Projeto;
import br.edu.infnet.appempenho.model.service.AppService;

@Component
public class AppTeste implements ApplicationRunner {
	
	@Autowired
	private AppService appService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "App.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				Projeto projeto = null;
				List<Classe> listaClasses = null;
				List<Atributo> listaAtributos = null;
				
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
					case "P":
						listaClasses = new ArrayList<Classe>();						
						
						projeto = new Projeto();
						projeto.setNome(campos[1]);
						projeto.setDescricao(campos[2]);
						projeto.setListaClasses(listaClasses);
						
						break;
					case "C":
						listaAtributos = new ArrayList<Atributo>();						
						
						Classe classe = new Classe();
						classe.setNome(campos[1]);
						classe.setListaAtributos(listaAtributos);
						
						listaClasses.add(classe);
						
						break;
					case "A":
						Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);
						
						listaAtributos.add(atributo);
						
						break;

					default:
						System.out.println("Opção inválida");
						break;
					}
					
					linha = leitura.readLine();
				}
				
				appService.incluir(projeto);
				
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
