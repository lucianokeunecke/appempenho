package br.edu.infnet.appempenho.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.Empenho;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.repository.EmpenhoRepository;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class EmpenhoService {
	
	@Autowired
	EmpenhoRepository empenhoRepository;
	
	public void incluir(Empenho empenho) {
		
		empenhoRepository.save(empenho);
		
		AppImpressao.relatorio("Inclusão do Empenho Nº " + empenho.getNumero(), empenho);
	}
	
	public void excluir(Integer id) {
		
		empenhoRepository.deleteById(id);
	}
	
	public Collection<Empenho> obterLista(){
		
		return (Collection<Empenho>) empenhoRepository.findAll();
	}
	
	public Collection<Empenho> obterLista(Usuario usuario){
		
		return (Collection<Empenho>) empenhoRepository.obterLista(usuario.getId());
	}

}
