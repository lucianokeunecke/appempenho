package br.edu.infnet.appempenho.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.TomadaPreco;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.repository.TomadaPrecoRepository;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class TomadaPrecoService {
	
	@Autowired
	private TomadaPrecoRepository tomadaPrecoRepository;
	
	public void incluir(TomadaPreco tomadaPreco) {
		
		tomadaPrecoRepository.save(tomadaPreco);
		
		AppImpressao.relatorio("Inclusão da Tomada de Preço Nº " + tomadaPreco.getNumero(), tomadaPreco);
	}
	
	public void excluir(Integer id) {
		
		tomadaPrecoRepository.deleteById(id);
	}
	
	public Collection<TomadaPreco> obterLista(){
		
		return (Collection<TomadaPreco>) tomadaPrecoRepository.findAll();
	}
	
	public Collection<TomadaPreco> obterLista(Usuario usuario){
		
		return (Collection<TomadaPreco>) tomadaPrecoRepository.obterLista(usuario.getId());
	}	

}
