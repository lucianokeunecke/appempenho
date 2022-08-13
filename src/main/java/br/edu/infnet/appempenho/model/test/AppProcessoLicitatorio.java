package br.edu.infnet.appempenho.model.test;

import br.edu.infnet.appempenho.model.domain.ProcessoLicitatorio;

public class AppProcessoLicitatorio {
	
	private String mensagem;
	
	public AppProcessoLicitatorio(String mensagem) {
		this.mensagem = mensagem;
	}

	public void relatorio(ProcessoLicitatorio processoLicitatorio) {
		System.out.println(mensagem);
		processoLicitatorio.impressao();		
	}	

}
