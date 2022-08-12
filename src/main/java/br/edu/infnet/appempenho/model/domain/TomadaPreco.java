package br.edu.infnet.appempenho.model.domain;

public class TomadaPreco extends ProcessoLicitatorio {
	
	private boolean permiteSubcontratacao;
	private String condicaoPagamento;
	private float valorEstimadoDotacaoOrcamentaria;	
	
	@Override
	public float calcularValorEstimadoEdital() {
		
		float indiceSubcontratacao = permiteSubcontratacao ? 3 : 2; 
		
		return getValorEstimadoEdital() * indiceSubcontratacao;
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
		return "Permite Sibcontratação: " + permiteSubcontratacao + "; Condição de Pagamento: " + condicaoPagamento + "; Valor Estimado da Dotação Orçamentária: R$ " + valorEstimadoDotacaoOrcamentaria + "; " +  super.toString();
	}	

}
