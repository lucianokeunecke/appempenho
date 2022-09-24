package br.edu.infnet.appempenho.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appempenho.interfaces.IPrinter;
import br.edu.infnet.appempenho.model.exception.CnpjCpfInvalidoException;

@Entity
@Table(name = "TFornecedor")
public class Fornecedor implements IPrinter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int codigo;
	private String nome;
	private long cnpjCpf;

	public Fornecedor() {
		
	}

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

	@Override
	public void impressao() {
		System.out.println(this);
		System.out.println("");
	}
	
}
