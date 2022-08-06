package br.edu.infnet.appempenho.model.domain;

import java.time.LocalDateTime;

public class ProcessoLicitatorio {
	
	private int numero;
	private LocalDateTime dataExpedicao;
	private String objetoLicitacao;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDateTime getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(LocalDateTime dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}

	public String getObjetoLicitacao() {
		return objetoLicitacao;
	}

	public void setObjetoLicitacao(String objetoLicitacao) {
		this.objetoLicitacao = objetoLicitacao;
	}

	@Override
	public String toString() {
		return numero + ";" + dataExpedicao + ";" + objetoLicitacao;
	}	

}
