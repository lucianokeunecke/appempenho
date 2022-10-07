package br.edu.infnet.appempenho.model.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import br.edu.infnet.appempenho.interfaces.IPrinter;
import br.edu.infnet.appempenho.model.exception.IndiceReajusteZeradoNegativoException;
import br.edu.infnet.appempenho.model.exception.ValorEstimadoDotacaoOrcamentariaException;
import br.edu.infnet.appempenho.model.exception.ValorMinimoCapitalInvalidoException;

@Entity
@Table(name = "TProcessoLicitatorio")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ProcessoLicitatorio implements IPrinter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDate dataExpedicao;
	private String objetoLicitacao;
	private float valorEstimadoEdital;
	@ManyToMany(mappedBy = "processosLicitatorios")
	private List<Empenho> empenhos;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;	
	
	public abstract float calcularValorEstimadoEdital() throws ValorMinimoCapitalInvalidoException, IndiceReajusteZeradoNegativoException, ValorEstimadoDotacaoOrcamentariaException; 
	
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

	public LocalDate getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(LocalDate dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}

	public String getObjetoLicitacao() {
		return objetoLicitacao;
	}

	public void setObjetoLicitacao(String objetoLicitacao) {
		this.objetoLicitacao = objetoLicitacao;
	}

	public float getValorEstimadoEdital() {
		return valorEstimadoEdital;
	}

	public void setValorEstimadoEdital(float valorEstimadoEdital) {
		this.valorEstimadoEdital = valorEstimadoEdital;
	}

	@Override
	public String toString() {
		return numero + ";" + dataExpedicao + ";" + objetoLicitacao + ";" + valorEstimadoEdital;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	

	public List<Empenho> getEmpenhos() {
		return empenhos;
	}

	public void setEmpenhos(List<Empenho> empenhos) {
		this.empenhos = empenhos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		ProcessoLicitatorio other = (ProcessoLicitatorio) obj;
		return numero == other.numero;
	}

}
