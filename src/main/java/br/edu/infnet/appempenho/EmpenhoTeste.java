package br.edu.infnet.appempenho;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.domain.Empenho;
import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.domain.ProcessoLicitatorio;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.service.EmpenhoService;

@Component
@Order(6)
public class EmpenhoTeste implements ApplicationRunner {
	
	@Autowired
	private EmpenhoService empenhoService;	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Set<ProcessoLicitatorio> listaProcessosLicitatorios = new HashSet<ProcessoLicitatorio>();
		
		Concorrencia concorrencia1 = new Concorrencia();
		concorrencia1.setId(1);
		concorrencia1.setNumero(120);		
		Concorrencia concorrencia2 = new Concorrencia();
		concorrencia2.setId(2);
		concorrencia2.setNumero(130);		
		Concorrencia concorrencia3 = new Concorrencia();
		concorrencia3.setId(3);
		concorrencia3.setNumero(140);		
		
		listaProcessosLicitatorios.add(concorrencia1);
		listaProcessosLicitatorios.add(concorrencia2);
		listaProcessosLicitatorios.add(concorrencia3);
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setId(1);
		
		Empenho empenho = new Empenho(fornecedor, listaProcessosLicitatorios);
		empenho.setNumero(1);
		empenho.setData(LocalDateTime.now());
		empenho.setValor(1563);
		empenho.setUsuario(usuario);
		
		empenhoService.incluir(empenho);
	}

}
