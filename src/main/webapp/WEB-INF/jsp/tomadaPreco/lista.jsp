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
	        <a class="nav-link" href="#">Empenho</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Fornecedor</a>
	      </li>
	    </ul>
	  </div>
	</nav>

	<div class="container mt-3">
	  
	  <h3>Classe: TomadaPreco</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Número</th>
	        <th>Data da Expedição</th>
	        <th>Objeto da Licitação</th>
	        <th>Permite Subcontratação</th>
	        <th>Condição de Pagamento</th>
	        <th>Valor Estimado Dotação Orçamentária</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>501</td>
	        <td>08/07/2022</td>
	        <td>Contratação de empresa especializada em serviço de limpeza</td>
	        <td>Sim</td>
	        <td>30/60/90 dias</td>
	        <td>150.000,00</td>
	      </tr>
	      <tr>
	        <td>515</td>
	        <td>18/07/2022</td>
	        <td>Contratação de exames laboratoriais</td>
	        <td>Não</td>
	        <td>45/90 dias</td>
	        <td>475.000,00</td>
	      </tr>
	      <tr>
	        <td>527</td>
	        <td>13/08/2022</td>
	        <td>Contratação de empresa especializada em serviços de contrução civil</td>
	        <td>Não</td>
	        <td>15/30/45/60/75/90 dias</td>
	        <td>650.000,00</td>
	      </tr>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>