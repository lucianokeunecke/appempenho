package br.edu.infnet.appempenho.model.domain;

public class Fornecedor {
	
	public int codigo;
	public String nome;
	public long cnpjCpf;
	
	public Fornecedor(int codigo, String nome, long cnpjCpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.cnpjCpf = cnpjCpf;
	}

	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + cnpjCpf;
	}		

}
