package br.edu.infnet.appempenho.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.domain.Usuario;
import br.edu.infnet.appempenho.model.repository.FornecedorRepository;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Service
public class FornecedorService {
	
	@Autowired
	FornecedorRepository fornecedorRepository;
	
	public void incluir(Fornecedor fornecedor) {
		
		fornecedorRepository.save(fornecedor);
		
		AppImpressao.relatorio("Inclusão do Fornecedor " + fornecedor.getNome(), fornecedor);
	}
	
	public void excluir(Integer id) {
		
		fornecedorRepository.deleteById(id);
	}
	
	public Collection<Fornecedor> obterLista(){
		
		return (Collection<Fornecedor>) fornecedorRepository.findAll();
	}
	
	public Collection<Fornecedor> obterLista(Usuario usuario){
		
		return (Collection<Fornecedor>) fornecedorRepository.obterLista(usuario.getId());
	}

}
