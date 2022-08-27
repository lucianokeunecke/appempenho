package br.edu.infnet.appempenho.model.domain;

import br.edu.infnet.appempenho.model.exception.IndiceReajusteZeradoNegativoException;

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
		return registroPreco + ";" + criterioJulgamento + ";" + indiceReajuste + ";" +  super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#Pregão");
		System.out.println(this);
	}

	@Override
	public float calcularValorEstimadoEdital() throws IndiceReajusteZeradoNegativoException {
		
		if (indiceReajuste == 0) {
			throw new IndiceReajusteZeradoNegativoException("Índice de reajuste " + indiceReajuste + " não pode igual a zero");
		}
		
		if (indiceReajuste < 0) {
			throw new IndiceReajusteZeradoNegativoException("Índice de reajuste " + indiceReajuste + " não pode ser negativo");
		}
		
		float valorReajuste = indiceReajuste * 1.5f;
		
		return getValorEstimadoEdital() * 2 + valorReajuste;
	}	

}
