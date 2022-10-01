package br.edu.infnet.appempenho.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.appempenho.interfaces.IPrinter;
import br.edu.infnet.appempenho.model.exception.EmpenhoSemProcessoLicitatorioException;
import br.edu.infnet.appempenho.model.exception.FornecedorNuloException;

@Entity
@Table(name = "TEmpenho")
public class Empenho implements IPrinter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private LocalDateTime data;
	private float valor;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idFornecedor")
	private Fornecedor fornecedor;
	@ManyToMany(cascade = CascadeType.DETACH)
	private Set<ProcessoLicitatorio> processosLicitatorios;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public Empenho() {
		
	}

	public Empenho(Fornecedor fornecedor, Set<ProcessoLicitatorio> processosLicitatorios) throws FornecedorNuloException, EmpenhoSemProcessoLicitatorioException {
		
		if (fornecedor == null) {
			throw new FornecedorNuloException("Fornecedor não informado.");
		}
		
		/*if (listaProcessosLicitatorios == null) {
			throw new EmpenhoSemProcessoLicitatorioException("Processo licitatório não informado.");
		}
		
		if (listaProcessosLicitatorios.size() < 1) {
			throw new EmpenhoSemProcessoLicitatorioException("Deve ser informado pelo menor um processo licitatório.");
		}*/
		
		this.data = LocalDateTime.now();
		this.fornecedor = fornecedor;
		this.processosLicitatorios = processosLicitatorios;
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

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}	

	public Set<ProcessoLicitatorio> getProcessosLicitatorios() {
		return processosLicitatorios;
	}

	public void setProcessosLicitatorios(Set<ProcessoLicitatorio> processosLicitatorios) {
		this.processosLicitatorios = processosLicitatorios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return numero + ";" + data + ";" + valor + ';' + fornecedor;
	}

	@Override
	public void impressao() {
		System.out.println(this);
		System.out.println("");
	}	

}
