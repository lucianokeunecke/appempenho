package br.edu.infnet.appempenho;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Fornecedor;

@Component
@Order(2)
public class FornecedorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("==========================================================");
		System.out.println("#Fornecedor");
		
		Fornecedor fornecedor1 = new Fornecedor();
		fornecedor1.setCodigo(15);
		fornecedor1.setNome("Luciano Keunecke");
		fornecedor1.setCnpjCpf(3189734992L);		
		System.out.println(fornecedor1);	
		
		Fornecedor fornecedor2 = new Fornecedor();
		fornecedor2.setCodigo(96);
		fornecedor2.setNome("Governança Brasil");
		fornecedor2.setCnpjCpf(4983932000152L);		
		System.out.println(fornecedor2);

		Fornecedor fornecedor3 = new Fornecedor();
		fornecedor3.setCodigo(175);
		fornecedor3.setNome("Eletrônica Blumenau");
		fornecedor3.setCnpjCpf(78642321000192L);		
		System.out.println(fornecedor3);		
		
	}

}
