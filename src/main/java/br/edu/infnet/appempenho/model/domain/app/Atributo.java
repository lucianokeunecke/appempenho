package br.edu.infnet.appempenho.model.domain.app;

import br.edu.infnet.appempenho.interfaces.IPrinter;

public class Atributo implements IPrinter {
	
	private String nome;
	private String tipo;
	private String descricao;
	
	public Atributo(String nome, String tipo, String descricao) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s", tipo, nome, descricao);
	}

	@Override
	public void impressao() {
		System.out.println(" - - - " + this);
		
	}	
}
