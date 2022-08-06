package br.edu.infnet.appempenho;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.Empenho;

@Component
@Order(1)
public class EmpenhoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("==========================================================");
		System.out.println("#Empenho");
		
		Empenho empenho1 = new Empenho();
		empenho1.setNumero(476);
		empenho1.setData(LocalDateTime.now());
		empenho1.setValor(5000);		
		System.out.println(empenho1);	
		
		Empenho empenho2 = new Empenho();
		empenho2.setNumero(843);
		empenho2.setData(LocalDateTime.now());
		empenho2.setValor(6500);		
		System.out.println(empenho2);		

		Empenho empenho3 = new Empenho();
		empenho3.setNumero(974);
		empenho3.setData(LocalDateTime.now());
		empenho3.setValor(2700);		
		System.out.println(empenho3);		
	}

}
