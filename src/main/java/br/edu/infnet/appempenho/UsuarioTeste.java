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

import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.UsuarioService;

@Component
@Order(1)
public class UsuarioTeste implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioService;
	
	private Usuario usuario;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		usuario = new Usuario();
		usuario.setEmail("admin@gmail.com");
		usuario.setNome("Administrador");
		usuario.setSenha("654321");
		
		usuarioService.incluir(usuario);
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "Usuario.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				String linha = leitura.readLine();
				
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					usuario = new Usuario();
					usuario.setEmail(campos[0]);
					usuario.setNome(campos[1]);
					usuario.setSenha(campos[2]);
					
					usuarioService.incluir(usuario);
					
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
