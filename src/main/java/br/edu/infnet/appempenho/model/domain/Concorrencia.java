package br.edu.infnet.appempenho.model.domain;

import br.edu.infnet.appempenho.model.exception.ValorMinimoCapitalInvalidoException;

public class Concorrencia extends ProcessoLicitatorio {
	
	private boolean eletronica;
	private String prazoExecucao;
	private float valorMinimoCapital;
	
	@Override
	public float calcularValorEstimadoEdital() throws ValorMinimoCapitalInvalidoException {
		
		if (valorMinimoCapital < 50000) {
			throw new ValorMinimoCapitalInvalidoException("Valor mínimo do capital R$ " + valorMinimoCapital + " não pode ser menor que R$ 50.000,00");
		}
		
		float valorEletronica = eletronica ? 3 : 7;
		
		float valorCapital = valorMinimoCapital * 0.01f;
		
		return (getValorEstimadoEdital() * 2) + valorEletronica + valorCapital;
	}
	
	public boolean isEletronica() {
		return eletronica;
	}

	public void setEletronica(boolean eletronica) {
		this.eletronica = eletronica;
	}

	public String getPrazoExecucao() {
		return prazoExecucao;
	}

	public void setPrazoExecucao(String prazoExecucao) {
		this.prazoExecucao = prazoExecucao;
	}

	public float getValorMinimoCapital() {
		return valorMinimoCapital;
	}

	public void setValorMinimoCapital(float valorMinimoCapital) {
		this.valorMinimoCapital = valorMinimoCapital;
	}

	@Override
	public String toString() {
		return eletronica + ";" + prazoExecucao + ";" + valorMinimoCapital + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println(this);		
		System.out.println("");
	}		

}
