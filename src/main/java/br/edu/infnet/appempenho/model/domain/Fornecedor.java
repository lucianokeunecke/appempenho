package br.edu.infnet.appempenho.model.domain;

public class Fornecedor {
	
	private int codigo;
	private String nome;
	private long cnpjCpf;
	
	public Fornecedor(int codigo, String nome, long cnpjCpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.cnpjCpf = cnpjCpf;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + "; Nome: " + nome + "; CNPJ/CPF: " + cnpjCpf;
	}
	
	public void impressao() {
		System.out.println("#Fornecedor");
		System.out.println(this);
	}

}
