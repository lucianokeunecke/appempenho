package br.edu.infnet.model.domain;

public class Concorrencia {
	
	private boolean eletronica;
	private String prazoExecucao;
	private float valorMinimoCapital;
	
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
		return eletronica + ";" + prazoExecucao + ";" + valorMinimoCapital;
	}		

}
