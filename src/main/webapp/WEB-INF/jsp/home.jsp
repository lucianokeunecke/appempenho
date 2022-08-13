<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppEmpenho</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
	  <div class="container-fluid">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link active" href="/">Home</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/concorrencia/lista">Concorrência</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/pregao/lista">Pregão</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/tomadaPreco/lista">Tomada de Preço</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/processoLicitatorio/lista">Processo Licitatório</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/empenho/lista">Empenho</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/fornecedor/lista">Fornecedor</a>
	      </li>
	    </ul>
	  </div>
	</nav>

	<div class="container mt-3">
	  <h2>AppEmpenho</h2>
	  <p>Projeto de Gestão de Empenhos</p>
	  
	  <h3>Classe: Empenho</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>numero</td>
	        <td>int</td>
	        <td>Número do Empenho</td>
	      </tr>
	      <tr>
	        <td>data</td>
	        <td>LocalDateTime</td>
	        <td>Data da Emissão do Empenho</td>
	      </tr>
	      <tr>
	        <td>valor</td>
	        <td>float</td>
	        <td>Valor do Empenho</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  
	  <h3>Classe: Fornecedor</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>codigo</td>
	        <td>int</td>
	        <td>Código do Fornecedor</td>
	      </tr>
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome/Razão Social do Fornecedor</td>
	      </tr>
	      <tr>
	        <td>cnpjCpf</td>
	        <td>long</td>
	        <td>CNPJ/CPF do Fornecedor</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  
	  <h3>Classe: ProcessoLicitatorio</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>numero</td>
	        <td>int</td>
	        <td>Número do Processo Licitatório</td>
	      </tr>
	      <tr>
	        <td>dataExpedicao</td>
	        <td>LocalDateTime</td>
	        <td>Data da Expedição do Processo Licitatório</td>
	      </tr>
	      <tr>
	        <td>objetoLicitacao</td>
	        <td>String</td>
	        <td>Descrição do Objeto da Licitação</td>
	      </tr>
	    </tbody>
	  </table>	 
	  
	  
	  <h3>Classe: Concorrencia</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>eletronica</td>
	        <td>boolean</td>
	        <td>Indica se a Modalidade de Concorrência é Eletrônica</td>
	      </tr>
	      <tr>
	        <td>prazoExecucao</td>
	        <td>String</td>
	        <td>Descrição do Prazo da Execução</td>
	      </tr>
	      <tr>
	        <td>valorMinimoCapital</td>
	        <td>float</td>
	        <td>Valor Mínimo de Capital</td>
	      </tr>
	    </tbody>
	  </table>	  
	   
	  
	  <h3>Classe: Pregao</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>registroPreco</td>
	        <td>boolean</td>
	        <td>Indica se a Modalidade de Pregão utiliza o Registro de Preço</td>
	      </tr>
	      <tr>
	        <td>criterioJulgamento</td>
	        <td>String</td>
	        <td>Descrição do Critério de Julgamento</td>
	      </tr>
	      <tr>
	        <td>valorEstimadoEdital</td>
	        <td>float</td>
	        <td>Valor Estimado do Edital</td>
	      </tr>
	    </tbody>
	  </table>	  


	  <h3>Classe: TomadaPreco</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>permiteSubcontratacao</td>
	        <td>boolean</td>
	        <td>Indica se a Modalidade de Tomada de Preço Permite a Subcontratação</td>
	      </tr>
	      <tr>
	        <td>condicaoPagamento</td>
	        <td>String</td>
	        <td>Descrição da Condição de Pagamento</td>
	      </tr>
	      <tr>
	        <td>valorEstimadoDotacaoOrcamentaria</td>
	        <td>float</td>
	        <td>Valor Estimado do Dotação Orçamentária</td>
	      </tr>
	    </tbody>
	  </table>	  
	  
	  
	</div>
</body>
</html>