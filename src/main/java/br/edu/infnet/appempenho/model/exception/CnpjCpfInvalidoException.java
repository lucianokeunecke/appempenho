package br.edu.infnet.appempenho.model.exception;

public class CnpjCpfInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CnpjCpfInvalidoException(String mensagem) {
		super(mensagem);
	}	

}
