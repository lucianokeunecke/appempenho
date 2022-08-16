package br.edu.infnet.appempenho.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import br.edu.infnet.appempenho.interfaces.IPrinter;

public class Empenho implements IPrinter {
	
	private int numero;
	private LocalDateTime data;
	private float valor;
	private Fornecedor fornecedor;
	private List<ProcessoLicitatorio> listaProcessosLicitatorios;

	public Empenho(Fornecedor fornecedor) {
		this.data = LocalDateTime.now();
		this.fornecedor = fornecedor;
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

	public List<ProcessoLicitatorio> getListaProcessosLicitatorios() {
		return listaProcessosLicitatorios;
	}

	public void setListaProcessosLicitatorios(List<ProcessoLicitatorio> listaProcessosLicitatorios) {
		this.listaProcessosLicitatorios = listaProcessosLicitatorios;
	}

	@Override
	public String toString() {
		return "Nº do Empenho: " + numero + "; Data da Emissão: " + data + "; Valor do Empenho: R$ " + valor + " Fornecedor: " + fornecedor + " Quantidade de Processos Licitatórios: " + listaProcessosLicitatorios.size();
	}

	@Override
	public void impressao() {
		System.out.println("#Empenho");
		System.out.println(this);
	}	

}
