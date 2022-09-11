package br.edu.infnet.appempenho.model.domain.app;

import java.util.List;

import br.edu.infnet.appempenho.interfaces.IPrinter;

public class Classe implements IPrinter {
	
	private String nome;
	private List<Atributo> listaAtributos; 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Atributo> getListaAtributos() {
		return listaAtributos;
	}

	public void setListaAtributos(List<Atributo> listaAtributos) {
		this.listaAtributos = listaAtributos;
	}

	@Override
	public void impressao() {
		System.out.println("- - " + nome);
		for (Atributo atributo: listaAtributos) {
			atributo.impressao();
		}
	}

}
