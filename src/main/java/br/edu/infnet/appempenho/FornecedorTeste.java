package br.edu.infnet.appempenho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.controller.FornecedorController;
import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.exception.CnpjCpfInvalidoException;

@Component
@Order(2)
public class FornecedorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		System.out.println("====================================================================================================================");
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "Fornecedor.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				while(linha != null) {

					try {						
						String[] campos = linha.split(";");
						
						Fornecedor fornecedor1 = new Fornecedor(Integer.parseInt(campos[0]), campos[1], Long.parseLong(campos[2]));
						FornecedorController.incluir(fornecedor1);
					} catch (CnpjCpfInvalidoException e) {
						System.out.println("[ERROR - FORNECEDOR] " + e.getMessage());
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
