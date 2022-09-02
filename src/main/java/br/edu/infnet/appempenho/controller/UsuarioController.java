package br.edu.infnet.appempenho.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;

import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Controller
public class UsuarioController {
	
	private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();
	
	public static void incluir(Usuario usuario) {
		
		mapaUsuario.put(usuario.getEmail(), usuario);
		
		AppImpressao.relatorio("Inclusão do usuário " + usuario.getNome(), usuario);
	}

	public static Collection<Usuario> obterLista(){
		return mapaUsuario.values();
	}	
	

}
