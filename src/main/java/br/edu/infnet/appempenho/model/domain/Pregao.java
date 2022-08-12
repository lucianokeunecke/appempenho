package br.edu.infnet.appempenho.model.domain;

public class Pregao extends ProcessoLicitatorio {
	
	private boolean registroPreco;
	private String criterioJulgamento;
	private float indiceReajuste;
		
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

	public float getIndiceReajuste() {
		return indiceReajuste;
	}

	public void setIndiceReajuste(float indiceReajuste) {
		this.indiceReajuste = indiceReajuste;
	}

	@Override
	public String toString() {
		return "Registro de Preço: " + registroPreco + "; Critério de Julgamento: " + criterioJulgamento + "; Índice de Reajuste: " + indiceReajuste + "; " +  super.toString();
	}	

}
