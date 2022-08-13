package br.edu.infnet.appempenho.model.test;

import br.edu.infnet.appempenho.interfaces.IPrinter;

public class AppImpressao {

	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		printer.impressao();		
	}	

}
