package br.edu.infnet.appempenho;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.Fornecedor;

@Component
@Order(2)
public class FornecedorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("==========================================================");
		System.out.println("#Fornecedor");
		
		Fornecedor fornecedor1 = new Fornecedor(15, "Luciano Keunecke", 3189734992L);
		System.out.println(fornecedor1);	
		
		Fornecedor fornecedor2 = new Fornecedor(96, "Governança Brasil", 4983932000152L);
		System.out.println(fornecedor2);	

		Fornecedor fornecedor3 = new Fornecedor(175, "Eletrônica Blumenau", 78642321000192L);
		System.out.println(fornecedor3);
		
	}

}
