package br.edu.infnet.appempenho;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.controller.FornecedorController;
import br.edu.infnet.appempenho.model.domain.Fornecedor;

@Component
@Order(2)
public class FornecedorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("====================================================================================================================");
		
		Fornecedor fornecedor1 = new Fornecedor(15, "Luciano Keunecke", 3189734992L);
		FornecedorController.incluir(fornecedor1);
		
		Fornecedor fornecedor2 = new Fornecedor(96, "Governança Brasil", 4983932000152L);
		FornecedorController.incluir(fornecedor2);

		Fornecedor fornecedor3 = new Fornecedor(175, "Eletrônica Blumenau", 78642321000192L);
		FornecedorController.incluir(fornecedor3);
	}

}
