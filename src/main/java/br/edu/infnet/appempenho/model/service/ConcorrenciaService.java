package br.edu.infnet.appempenho.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.repository.ConcorrenciaRepository;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class ConcorrenciaService {
	
	@Autowired
	private ConcorrenciaRepository concorrenciaRepository;
	
	public void incluir(Concorrencia concorrencia) {
		
		concorrenciaRepository.save(concorrencia);
		
		AppImpressao.relatorio("Inclusão da Concorrência Nº " + concorrencia.getNumero(), concorrencia);
	}
	
	public void excluir(Integer id) {
		
		concorrenciaRepository.deleteById(id);
	}
	
	public Collection<Concorrencia> obterLista(){
		
		return (Collection<Concorrencia>) concorrenciaRepository.findAll();
	}	
	
	public Collection<Concorrencia> obterLista(Usuario usuario){
		
		return (Collection<Concorrencia>) concorrenciaRepository.obterLista(usuario.getId());
	}	

}
