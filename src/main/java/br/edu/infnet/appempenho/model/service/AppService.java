package br.edu.infnet.appempenho.model.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.app.Projeto;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class AppService {
	
	private Projeto projeto;
	
	public void incluir(Projeto projeto) {
		this.projeto = projeto;
		
		AppImpressao.relatorio("Exibição do Projeto " + projeto.getNome(), projeto);
	}
	
	public Projeto obterProjeto() {
		return projeto;
	}

}
