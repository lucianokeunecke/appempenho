package br.edu.infnet.appempenho.model.domain;

import br.edu.infnet.appempenho.interfaces.IPrinter;

public class Fornecedor implements IPrinter {
	
	private int codigo;
	private String nome;
	private long cnpjCpf;
	
	public Fornecedor(int codigo, String nome, long cnpjCpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.cnpjCpf = cnpjCpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public long getCnpjCpf() {
		return cnpjCpf;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + "; Nome: " + nome + "; CNPJ/CPF: " + cnpjCpf;
	}

	@Override
	public void impressao() {
		System.out.println("#Fornecedor");
		System.out.println(this);
	}
	
}
