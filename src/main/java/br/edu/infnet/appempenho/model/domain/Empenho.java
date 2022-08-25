package br.edu.infnet.appempenho.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appempenho.interfaces.IPrinter;

public class Empenho implements IPrinter {
	
	private int id;
	private int numero;
	private LocalDateTime data;
	private float valor;
	private Fornecedor fornecedor;
	private Set<ProcessoLicitatorio> listaProcessosLicitatorios;

	public Empenho(Fornecedor fornecedor, Set<ProcessoLicitatorio> listaProcessosLicitatorios) {
		this.data = LocalDateTime.now();
		this.fornecedor = fornecedor;
		this.listaProcessosLicitatorios = listaProcessosLicitatorios;
	} 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	@Override
	public String toString() {
		return "Nº do Empenho: " + numero + "; Data da Emissão: " + data + "; Valor do Empenho: R$ " + valor + " Fornecedor: " + fornecedor + "; Quantidade de Processos Licitatórios: " + listaProcessosLicitatorios.size();
	}

	@Override
	public void impressao() {
		System.out.println("#Empenho");
		System.out.println(this);
	}	

}
