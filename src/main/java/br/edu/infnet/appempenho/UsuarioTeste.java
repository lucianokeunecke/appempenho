package br.edu.infnet.appempenho;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.controller.UsuarioController;
import br.edu.infnet.appempenho.model.domain.Usuario;

@Component
public class UsuarioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setEmail("lucianokeunecke@gmail.com");
		usuario.setNome("Luciano Keunecke");
		usuario.setSenha("123456");
		
		UsuarioController.incluir(usuario);
		
	}

}
