package br.edu.infnet.appempenho.model.domain;

import java.time.LocalDateTime;

import br.edu.infnet.appempenho.interfaces.IPrinter;

public abstract class ProcessoLicitatorio implements IPrinter {
	
	private int numero;
	private LocalDateTime dataExpedicao;
	private String objetoLicitacao;
	private float valorEstimadoEdital;
	
	public abstract float calcularValorEstimadoEdital(); 
	
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

	public float getValorEstimadoEdital() {
		return valorEstimadoEdital;
	}

	public void setValorEstimadoEdital(float valorEstimadoEdital) {
		this.valorEstimadoEdital = valorEstimadoEdital;
	}

	@Override
	public String toString() {
		return "Nº Processo: " + numero + "; Data da Expedição: " + dataExpedicao + "; Objeto da Licitação: " + objetoLicitacao + "; Valor Estimado do Edital: R$ " + calcularValorEstimadoEdital();
	}	

}
