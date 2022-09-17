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

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  
	  <h3>Cadastro de Processo Licitatório: Pregão</h3>
	  
	  <h4><a href="/pregao">Novo</a></h4>
	  
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Número</th>
	        <th>Data da Expedição</th>
	        <th>Objeto da Licitação</th>
	        <th>Registro de Preço</th>
	        <th>Critério de Julgamento</th>
	        <th>Indice de Reajuste</th>
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
		        <td>${b.registroPreco}</td>
		        <td>${b.criterioJulgamento}</td>
		        <td>${b.indiceReajuste}</td>
		        <td><a href="/pregao/${b.id}/excluir">Excluir</a></td>
		      </tr>    	  
    	  </c:forEach>	    
	    
	    </tbody>
	  </table>
	  
	</div>
</body>
</html>