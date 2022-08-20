<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	        <a class="nav-link" href="/concorrencia/lista">Concorr�ncia</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/pregao/lista">Preg�o</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/tomadaPreco/lista">Tomada de Pre�o</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/processoLicitatorio/lista">Processo Licitat�rio</a>
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
	  
	  <h3>Classe: ProcessoLicitatorio</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>N�mero</th>
	        <th>Data da Expedi��o</th>
	        <th>Objeto da Licita��o</th>
	        <th>Valor Estimado do Edital</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>701</td>
	        <td>15/07/2022</td>
	        <td>Aquisi��o de bens patrimoniais</td>
	        <td>75.000,00</td>
	      </tr>
	      <tr>
	        <td>713</td>
	        <td>19/07/2022</td>
	        <td>Aquisi��o de pe�as de ve�culos</td>
	        <td>105.000,00</td>
	      </tr>
	      <tr>
	        <td>737</td>
	        <td>31/07/2022</td>
	        <td>Aquisi��o de materiais el�tricos</td>
	        <td>145.000,00</td>
	      </tr>
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>