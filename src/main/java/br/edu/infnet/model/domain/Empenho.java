package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Empenho {
	
	private int numero;
	private LocalDateTime data;
	private float valor;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return numero + ";" + data + ";" + valor;
	}	

}
