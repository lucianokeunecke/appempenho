package br.edu.infnet.appempenho.model.domain.app;

import java.util.List;

import br.edu.infnet.appempenho.interfaces.IPrinter;

public class Projeto implements IPrinter {
	
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

	@Override
	public void impressao() {
		System.out.println("- " + nome + " | " + descricao);
		for (Classe classe: listaClasses) {
			classe.impressao();
		}
	}

}
