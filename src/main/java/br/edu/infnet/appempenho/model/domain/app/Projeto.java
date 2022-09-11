package br.edu.infnet.appempenho.model.domain.app;

import java.util.List;

public class Projeto {
	
	private String nome;
	private String descricao;
	private List<Classe> listaClasses;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Classe> getListaClasses() {
		return listaClasses;
	}

	public void setListaClasses(List<Classe> listaClasses) {
		this.listaClasses = listaClasses;
	}

}
