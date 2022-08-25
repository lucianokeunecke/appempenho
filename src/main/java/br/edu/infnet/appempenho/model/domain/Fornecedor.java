package br.edu.infnet.appempenho.model.domain;

import br.edu.infnet.appempenho.interfaces.IPrinter;
import br.edu.infnet.appempenho.model.exception.CnpjCpfInvalidoException;

public class Fornecedor implements IPrinter {
	
	private int id;
	private int codigo;
	private String nome;
	private long cnpjCpf;
	
	public Fornecedor(int codigo, String nome, long cnpjCpf) throws CnpjCpfInvalidoException {
		
		if (cnpjCpf == 0) {
			throw new CnpjCpfInvalidoException("Cnpj/Cpf não informado.");
		}
		
		if (cnpjCpf < 0) {
			throw new CnpjCpfInvalidoException("Cnpj/Cpf não pode ser negativo.");
		}
		
		this.codigo = codigo;
		this.nome = nome;
		this.cnpjCpf = cnpjCpf;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
