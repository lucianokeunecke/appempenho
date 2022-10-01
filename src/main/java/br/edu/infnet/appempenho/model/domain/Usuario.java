package br.edu.infnet.appempenho.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.edu.infnet.appempenho.interfaces.IPrinter;

@Entity
@Table(name = "TUsuario")
public class Usuario implements IPrinter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String senha;	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Fornecedor> fornecedores;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<ProcessoLicitatorio> processosLicitatorios;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Empenho> empenhos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}	
	
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public List<ProcessoLicitatorio> getProcessosLicitatorios() {
		return processosLicitatorios;
	}

	public void setProcessosLicitatorios(List<ProcessoLicitatorio> processosLicitatorios) {
		this.processosLicitatorios = processosLicitatorios;
	}

	public List<Empenho> getEmpenhos() {
		return empenhos;
	}

	public void setEmpenhos(List<Empenho> empenhos) {
		this.empenhos = empenhos;
	}

	@Override
	public String toString() {
		return nome + ";" + email + ";" + senha;
	}

	@Override
	public void impressao() {
		System.out.println(this);
		System.out.println("");
	}
	
}
