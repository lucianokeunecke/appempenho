package br.edu.infnet.model.domain;

public class TomadaPreco {
	
	private boolean permiteSubcontratacao;
	private String condicaoPagamento;
	private float valorEstimadoDotacaoOrcamentaria;
	
	public boolean isPermiteSubcontratacao() {
		return permiteSubcontratacao;
	}
	
	public void setPermiteSubcontratacao(boolean permiteSubcontratacao) {
		this.permiteSubcontratacao = permiteSubcontratacao;
	}
	
	public String getCondicaoPagamento() {
		return condicaoPagamento;
	}
	
	public void setCondicaoPagamento(String condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}
	
	public float getValorEstimadoDotacaoOrcamentaria() {
		return valorEstimadoDotacaoOrcamentaria;
	}
	
	public void setValorEstimadoDotacaoOrcamentaria(float valorEstimadoDotacaoOrcamentaria) {
		this.valorEstimadoDotacaoOrcamentaria = valorEstimadoDotacaoOrcamentaria;
	}
	
	@Override
	public String toString() {
		return permiteSubcontratacao + ";" + condicaoPagamento + ";" + valorEstimadoDotacaoOrcamentaria;
	}	

}
