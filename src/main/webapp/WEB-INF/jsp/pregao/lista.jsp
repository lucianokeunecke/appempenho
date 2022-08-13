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
	        <a class="nav-link" href="#">Fornecedor</a>
	      </li>
	    </ul>
	  </div>
	</nav>

	<div class="container mt-3">
	  
	  <h3>Classe: Pregao</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Número</th>
	        <th>Data da Expedição</th>
	        <th>Objeto da Licitação</th>
	        <th>Registro de Preço</th>
	        <th>Critério de Julgamento</th>
	        <th>Indice de Reajuste</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>356</td>
	        <td>03/07/2022</td>
	        <td>Contratação de materiais de consumo</td>
	        <td>Sim</td>
	        <td>Menor Preço</td>
	        <td>3,50</td>
	      </tr>
	      <tr>
	        <td>475</td>
	        <td>21/07/2022</td>
	        <td>Contratação de materiais de expediente</td>
	        <td>Não</td>
	        <td>Maior Desconto</td>
	        <td>1,75</td>
	      </tr>
	      <tr>
	        <td>490</td>
	        <td>01/08/2022</td>
	        <td>Contratação de materiais de escritório</td>
	        <td>Sim</td>
	        <td>Maior Lance ou Oferta</td>
	        <td>0,75</td>
	      </tr>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>