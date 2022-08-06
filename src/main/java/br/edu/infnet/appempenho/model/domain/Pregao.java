package br.edu.infnet.appempenho.model.domain;

public class Pregao extends ProcessoLicitatorio {
	
	public boolean registroPreco;
	public String criterioJulgamento;
	public float valorEstimadoEdital;	
	
	@Override
	public String toString() {
		return registroPreco + ";" + criterioJulgamento + ";" + valorEstimadoEdital + super.toString();
	}	

}
