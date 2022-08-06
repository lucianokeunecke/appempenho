package br.edu.infnet.appempenho;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.model.domain.Pregao;

@Component
@Order(4)
public class PregaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("==========================================================");
		System.out.println("#Pregão");
		
		Pregao pregao1 = new Pregao();
		pregao1.numero = 356;
		pregao1.dataExpedicao = LocalDateTime.now();
		pregao1.objetoLicitacao = "Contratação de materiais de consumo";
		pregao1.registroPreco = true;
		pregao1.criterioJulgamento = "Menor Preço";
		pregao1.valorEstimadoEdital = 450000;		
		System.out.println(pregao1);		
		
		Pregao pregao2 = new Pregao();
		pregao2.numero = 376;
		pregao2.dataExpedicao = LocalDateTime.now();
		pregao2.objetoLicitacao = "Contratação de materiais de expediente";
		pregao2.registroPreco = false;
		pregao2.criterioJulgamento = "Maior Desconto";
		pregao2.valorEstimadoEdital = 700000;		
		System.out.println(pregao2);		
		
		Pregao pregao3 = new Pregao();
		pregao3.numero = 397;
		pregao3.dataExpedicao = LocalDateTime.now();
		pregao3.objetoLicitacao = "Contratação de materiais de escritório";
		pregao3.registroPreco = false;
		pregao3.criterioJulgamento = "Maior Lance ou Oferta";
		pregao3.valorEstimadoEdital = 1500000;		
		System.out.println(pregao3);		
		
	}

}
