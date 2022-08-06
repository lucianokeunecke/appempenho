package br.edu.infnet.appempenho.model.domain;

public class TomadaPreco extends ProcessoLicitatorio {
	
	public boolean permiteSubcontratacao;
	public String condicaoPagamento;
	public float valorEstimadoDotacaoOrcamentaria;	
	
	@Override
	public String toString() {
		return permiteSubcontratacao + ";" + condicaoPagamento + ";" + valorEstimadoDotacaoOrcamentaria + super.toString();
	}	

}
