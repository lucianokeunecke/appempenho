package br.edu.infnet.appempenho.model.domain;

public class Concorrencia extends ProcessoLicitatorio {
	
	private boolean eletronica;
	private String prazoExecucao;
	private float valorMinimoCapital;
	
	@Override
	public float calcularValorEstimadoEdital() {
		
		System.out.println("Calcular valor estimado - Concorrência");		
		
		float valorEletronica = eletronica ? 3 : 7;
		
		float valorCapital = valorMinimoCapital * 0.01f;
		
		return super.calcularValorEstimadoEdital() + valorEletronica + valorCapital;
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
		return "Eletrônica: " + eletronica + "; Prazo de Execução: " + prazoExecucao + "; Valor Mínimo de Capital: R$ " + valorMinimoCapital + "; " + super.toString();
	}		

}
