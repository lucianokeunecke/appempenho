package br.edu.infnet.appempenho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.app.Atributo;
import br.edu.infnet.appempenho.model.domain.app.Classe;
import br.edu.infnet.appempenho.model.domain.app.Projeto;

@Component
public class AppTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "App.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
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
		
		Atributo eletronica = new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica");
		Atributo prazoExecucao = new Atributo("prazoExecucao", "String", "Descrição do Prazo da Execução");
		Atributo valorMinimoCapital = new Atributo("valorMinimoCapital", "float", "Valor Mínimo de Capital");
		
		List<Atributo> listaAtributos = new ArrayList<Atributo>();
		listaAtributos.add(eletronica);
		listaAtributos.add(prazoExecucao);
		listaAtributos.add(valorMinimoCapital);
		
		Classe concorrencia = new Classe();
		concorrencia.setNome("Concorrencia");
		concorrencia.setListaAtributos(listaAtributos);
		
		Classe empenho = new Classe();
		empenho.setNome("Empenho");
		empenho.setListaAtributos(Arrays.asList(new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
												new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
												new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica")));
		
		Classe fornecedor = new Classe();
		fornecedor.setNome("Fornecedor");
		fornecedor.setListaAtributos(Arrays.asList(new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
				new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
				new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica")));
		
		Classe pregao = new Classe();
		pregao.setNome("Pregao");
		pregao.setListaAtributos(Arrays.asList(new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
				new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
				new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica")));
		
		Classe tomadaPreco = new Classe();
		tomadaPreco.setNome("TomadaPreco");
		tomadaPreco.setListaAtributos(Arrays.asList(new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
				new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
				new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica")));
		
		Classe usuario = new Classe();
		usuario.setNome("Usuario");		
		usuario.setListaAtributos(Arrays.asList(new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
				new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica"),
				new Atributo("eletronica", "boolean", "Indica se a Modalidade de Concorrência é Eletrônica")));
		
		List<Classe> listaClasses = new ArrayList<Classe>();
		listaClasses.add(concorrencia);
		listaClasses.add(empenho);
		listaClasses.add(fornecedor);
		listaClasses.add(pregao);
		listaClasses.add(tomadaPreco);
		listaClasses.add(usuario);
		
		Projeto projeto = new Projeto();
		projeto.setNome("AppEmpenho");
		projeto.setDescricao("Projeto de Gestão de Empenhos");
		projeto.setListaClasses(listaClasses);
		projeto.impressao();
		
		/*for (Classe itemClasse : projeto.getListaClasses()) {
			System.out.println(" - - - " + itemClasse.getNome() + " | | " + itemClasse.getListaAtributos().size());
		}*/
		
		
	}
}
