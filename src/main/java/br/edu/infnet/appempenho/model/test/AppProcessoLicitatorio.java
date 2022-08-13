package br.edu.infnet.appempenho.model.test;

import br.edu.infnet.appempenho.model.domain.ProcessoLicitatorio;

public class AppProcessoLicitatorio {

	public static void relatorio(String mensagem, ProcessoLicitatorio processoLicitatorio) {
		System.out.println(mensagem);
		processoLicitatorio.impressao();		
	}	

}
