package br.edu.infnet.appempenho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.exception.CnpjCpfInvalidoException;
import br.edu.infnet.appempenho.model.service.FornecedorService;

@Component
@Order(2)
public class FornecedorTeste implements ApplicationRunner {
	
	@Autowired
	private FornecedorService fornecedorService;

	@Override
	public void run(ApplicationArguments args) {

		System.out.println("");
		System.out.println("====================================================================================================================");
		System.out.println("*********************************************** FORNECEDOR *********************************************************");
		System.out.println("====================================================================================================================");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setEmail("admin@gmail.com");
		usuario.setNome("Administrador");
		usuario.setSenha("654321");
		
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
						
						Fornecedor fornecedor = new Fornecedor(Integer.parseInt(campos[0]), campos[1], Long.parseLong(campos[2]));
						fornecedor.setUsuario(usuario);
						fornecedorService.incluir(fornecedor);
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
