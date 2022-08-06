package br.edu.infnet.appempenho.model.domain;

public class Concorrencia extends ProcessoLicitatorio {
	
	public boolean eletronica;
	public String prazoExecucao;
	public float valorMinimoCapital;	
	
	@Override
	public String toString() {
		return eletronica + ";" + prazoExecucao + ";" + valorMinimoCapital + super.toString();
	}		

}
