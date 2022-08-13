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
	        <a class="nav-link" href="#">Tomada de Preço</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Processo Licitatório</a>
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
	  
	  <h3>Classe: Concorrencia</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Número</th>
	        <th>Data da Expedição</th>
	        <th>Objeto da Licitação</th>
	        <th>Eletrônica</th>
	        <th>Prazo de Execução</th>
	        <th>Valor Mínimo de Capital</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>150</td>
	        <td>10/07/2022</td>
	        <td>Contratação de empresa especializada para execução de serviço de capeamento asfáltico</td>
	        <td>Sim</td>
	        <td>30/60 Dias</td>
	        <td>150000</td>
	      </tr>
	      <tr>
	        <td>175</td>
	        <td>03/08/2022</td>
	        <td>Contratação de empresa especializada para execução de serviço de engenharia</td>
	        <td>Não</td>
	        <td>45 Dias</td>
	        <td>175000</td>
	      </tr>
	      <tr>
	        <td>197</td>
	        <td>13/08/2022</td>
	        <td>Contratação de empresa especializada para execução de obra</td>
	        <td>Sim</td>
	        <td>30/60/90/120 Dias</td>
	        <td>375000</td>
	      </tr>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>