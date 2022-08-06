package br.edu.infnet.appempenho.model.domain;

import java.time.LocalDateTime;

public class ProcessoLicitatorio {
	
	public int numero;
	public LocalDateTime dataExpedicao;
	public String objetoLicitacao;
	
	@Override
	public String toString() {
		return numero + ";" + dataExpedicao + ";" + objetoLicitacao;
	}	

}
