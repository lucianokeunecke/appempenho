package br.edu.infnet.appempenho.model.domain;

import br.edu.infnet.appempenho.model.exception.ValorEstimadoDotacaoOrcamentariaException;

public class TomadaPreco extends ProcessoLicitatorio {
	
	private boolean permiteSubcontratacao;
	private String condicaoPagamento;
	private float valorEstimadoDotacaoOrcamentaria;	
	
	@Override
	public float calcularValorEstimadoEdital() throws ValorEstimadoDotacaoOrcamentariaException {
		
		if (valorEstimadoDotacaoOrcamentaria < 0 || valorEstimadoDotacaoOrcamentaria > 500000) {
			throw new ValorEstimadoDotacaoOrcamentariaException("Valor estimado da dotação orçamentária R$ " + valorEstimadoDotacaoOrcamentaria + " não pode ser menor que zero ou maior que R$ 500.000,00");
		}
		
		float indiceSubcontratacao = permiteSubcontratacao ? 3 : 2; 
		
		return getValorEstimadoEdital() * indiceSubcontratacao + valorEstimadoDotacaoOrcamentaria;
	}
	
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
		return permiteSubcontratacao + ";" + condicaoPagamento + ";" + valorEstimadoDotacaoOrcamentaria + ";" +  super.toString();
	}

	@Override
	public void impressao() {
		System.out.println(this);
		System.out.println("");
	}	

}
