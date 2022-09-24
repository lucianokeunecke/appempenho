package br.edu.infnet.appempenho.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.ProcessoLicitatorio;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.repository.ProcessoLicitatorioRepository;

@Service
public class ProcessoLicitatorioService {
	
	@Autowired
	ProcessoLicitatorioRepository processoLicitatorioRepository;
	
	public List<ProcessoLicitatorio> obterLista() {
		return (List<ProcessoLicitatorio>) processoLicitatorioRepository.findAll();
	}
	
	public List<ProcessoLicitatorio> obterLista(Usuario usuario) {
		return (List<ProcessoLicitatorio>) processoLicitatorioRepository.obterLista(usuario.getId());
	}
	
	public void excluir(Integer id) {
		processoLicitatorioRepository.deleteById(id);
	}

}
