package br.edu.infnet.model.domain;

public class Pregao {
	
	private boolean registroPreco;
	private String criterioJulgamento;
	private float valorEstimadoEdital;
	
	public boolean isRegistroPreco() {
		return registroPreco;
	}
	
	public void setRegistroPreco(boolean registroPreco) {
		this.registroPreco = registroPreco;
	}
	
	public String getCriterioJulgamento() {
		return criterioJulgamento;
	}
	
	public void setCriterioJulgamento(String criterioJulgamento) {
		this.criterioJulgamento = criterioJulgamento;
	}
	
	public float getValorEstimadoEdital() {
		return valorEstimadoEdital;
	}
	
	public void setValorEstimadoEdital(float valorEstimadoEdital) {
		this.valorEstimadoEdital = valorEstimadoEdital;
	}
	
	@Override
	public String toString() {
		return registroPreco + ";" + criterioJulgamento + ";" + valorEstimadoEdital;
	}	

}
