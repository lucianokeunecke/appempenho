package br.edu.infnet.appempenho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appempenho.controller.EmpenhoController;
import br.edu.infnet.appempenho.model.domain.Concorrencia;
import br.edu.infnet.appempenho.model.domain.Empenho;
import br.edu.infnet.appempenho.model.domain.Fornecedor;
import br.edu.infnet.appempenho.model.domain.Pregao;
import br.edu.infnet.appempenho.model.domain.ProcessoLicitatorio;
import br.edu.infnet.appempenho.model.domain.TomadaPreco;
import br.edu.infnet.appempenho.model.exception.CnpjCpfInvalidoException;
import br.edu.infnet.appempenho.model.exception.EmpenhoSemProcessoLicitatorioException;
import br.edu.infnet.appempenho.model.exception.FornecedorNuloException;

@Component
@Order(1)
public class EmpenhoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		System.out.println("");
		System.out.println("====================================================================================================================");
		System.out.println("************************************************ EMPENHO ***********************************************************");
		System.out.println("====================================================================================================================");
		
		String diretorio = "D:/Keunecke/INFNET/Modulo 03/appempenho/src/main/resources/arquivos/";
		
		String arquivo = "Empenhos.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(diretorio + arquivo);
				
				BufferedReader leitura = new BufferedReader(fileReader); 
				
				Set<ProcessoLicitatorio> listaProcessosLicitatorios = null;
				
				List<Empenho> listaEmpenhos = new ArrayList<Empenho>();
				
				String linha = leitura.readLine();
				
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					switch (campos[0].toLowerCase()) {
					case "e":
						try {
							listaProcessosLicitatorios = new HashSet<ProcessoLicitatorio>();
							
							Fornecedor fornecedor = new Fornecedor(Integer.parseInt(campos[4]), campos[5], Long.parseLong(campos[6])); 
							
							Empenho empenho = new Empenho(fornecedor, listaProcessosLicitatorios);
							empenho.setNumero(Integer.parseInt(campos[1]));
							empenho.setValor(Float.parseFloat(campos[3]));
							
							listaEmpenhos.add(empenho);
						} catch (CnpjCpfInvalidoException | FornecedorNuloException | EmpenhoSemProcessoLicitatorioException e) {
							System.out.println("[ERROR - EMPENHO] " + e.getMessage());
						}
						break;
					case "c":
						Concorrencia concorrencia = new Concorrencia();
						concorrencia.setNumero(Integer.parseInt(campos[4]));
						concorrencia.setDataExpedicao(LocalDateTime.now());
						concorrencia.setObjetoLicitacao(campos[6]);
						concorrencia.setEletronica(Boolean.parseBoolean(campos[1]));
						concorrencia.setPrazoExecucao(campos[2]);
						concorrencia.setValorMinimoCapital(Float.parseFloat(campos[3]));
						
						listaProcessosLicitatorios.add(concorrencia);
						
						break;
					case "p":
						Pregao pregao = new Pregao();
						pregao.setNumero(Integer.parseInt(campos[4]));
						pregao.setDataExpedicao(LocalDateTime.now());
						pregao.setObjetoLicitacao(campos[6]);
						pregao.setValorEstimadoEdital(550000);
						pregao.setRegistroPreco(Boolean.parseBoolean(campos[1]));
						pregao.setCriterioJulgamento(campos[2]);
						pregao.setIndiceReajuste(Float.parseFloat(campos[3]));		
						
						listaProcessosLicitatorios.add(pregao);
						
						break;
					case "t":
						TomadaPreco tomadaPreco = new TomadaPreco();
						tomadaPreco.setNumero(Integer.parseInt(campos[4]));
						tomadaPreco.setDataExpedicao(LocalDateTime.now());
						tomadaPreco.setObjetoLicitacao(campos[6]);
						tomadaPreco.setValorEstimadoEdital(200000);
						tomadaPreco.setPermiteSubcontratacao(Boolean.parseBoolean(campos[1]));
						tomadaPreco.setCondicaoPagamento(campos[2]);
						tomadaPreco.setValorEstimadoDotacaoOrcamentaria(Float.parseFloat(campos[3]));
						
						listaProcessosLicitatorios.add(tomadaPreco);
						
						break;
					default:
						break;
					}
					
					linha = leitura.readLine();
				}
				
				for (Empenho empenho: listaEmpenhos) {
					
					EmpenhoController.incluir(empenho);
					
					System.out.println("Percorrendo a lista de empenhos " + empenho.getNumero());
					System.out.println("Percorrendo a lista de empenhos " + empenho.getFornecedor().getNome());
					System.out.println("Percorrendo a lista de empenhos " + empenho.getListaProcessosLicitatorios().size());
					
				}
				
				leitura.close();
				
				fileReader.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe");
			} catch (IOException e) {
				System.out.println("[ERRO] Problema no fechamento do arquivo");
			}
		} finally {
			System.out.println("Terminou!!!");
		}
		
	}
}
