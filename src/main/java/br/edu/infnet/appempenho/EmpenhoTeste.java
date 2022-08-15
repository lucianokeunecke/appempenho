package br.edu.infnet.appempenho;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.Empenho;
import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.test.AppImpressao;

@Component
@Order(1)
public class EmpenhoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("====================================================================================================================");
		
		Empenho empenho1 = new Empenho(new Fornecedor(15, "Luciano Keunecke", 3189734992L));
		empenho1.setNumero(476);
		empenho1.setValor(5000);
		AppImpressao.relatorio("Inclusão do Empenho Nº " + empenho1.getNumero(), empenho1);
		
		Empenho empenho2 = new Empenho(new Fornecedor(96, "Governança Brasil", 4983932000152L));
		empenho2.setNumero(843);
		empenho2.setValor(6500);		
		AppImpressao.relatorio("Inclusão do Empenho Nº " + empenho2.getNumero(), empenho2);

		Empenho empenho3 = new Empenho(new Fornecedor(175, "Eletrônica Blumenau", 78642321000192L));
		empenho3.setNumero(974);
		empenho3.setValor(2700);		
		AppImpressao.relatorio("Inclusão do Empenho Nº " + empenho3.getNumero(), empenho3);
	}

}
