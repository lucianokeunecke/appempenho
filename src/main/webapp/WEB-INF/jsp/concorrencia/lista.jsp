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
	  
	  <h3>Cadastro de Processo Licitat�rio: Concorr�ncia</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>N�mero</th>
	        <th>Data da Expedi��o</th>
	        <th>Objeto da Licita��o</th>
	        <th>Eletr�nica</th>
	        <th>Prazo de Execu��o</th>
	        <th>Valor M�nimo de Capital</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	    
    	  <c:forEach var="b" items="${listagem}">
		      <tr>
		        <td>${b.id}</td>
		        <td>${b.numero}</td>
		        <td>${b.dataExpedicao}</td>
		        <td>${b.objetoLicitacao}</td>
		        <td>${b.eletronica}</td>
		        <td>${b.prazoExecucao}</td>
		        <td>${b.valorMinimoCapital}</td>
		        <td><a href="/concorrencia/${b.id}/excluir">Excluir</a></td>
		      </tr>    	  
    	  </c:forEach>
	      
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>