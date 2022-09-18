package br.edu.infnet.appempenho.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.ProcessoLicitatorio;

@Service
public class ProcessoLicitatorioService {
	
	@Autowired
	private ConcorrenciaService concorrenciaService;
	
	@Autowired
	private PregaoService pregaoService;
	
	@Autowired
	private TomadaPrecoService tomadaPrecoService;
	
	public List<ProcessoLicitatorio> obterLista(){
		
		List<ProcessoLicitatorio> listaProcessosLicitatorios = new ArrayList<ProcessoLicitatorio>();
		
		listaProcessosLicitatorios.addAll(concorrenciaService.obterLista());
		listaProcessosLicitatorios.addAll(pregaoService.obterLista());
		listaProcessosLicitatorios.addAll(tomadaPrecoService.obterLista());
		
		return listaProcessosLicitatorios;
	}	

}
