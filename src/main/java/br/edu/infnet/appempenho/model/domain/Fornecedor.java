package br.edu.infnet.appempenho.model.domain;

public class Fornecedor {
	
	private int codigo;
	private String nome;
	private long cnpjCpf;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(long cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + cnpjCpf;
	}		

}
