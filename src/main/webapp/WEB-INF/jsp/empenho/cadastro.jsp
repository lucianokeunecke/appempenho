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
	
	  <h2>Cadastro de Empenho</h2>
	  <form action="/empenho/incluir" method="post">
	  
	    <div class="mb-3 mt-3">
	      <label>Número:</label>
	      <input type="text" class="form-control" placeholder="Entre com o número" name="numero">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Data:</label>
	      <input type="date" class="form-control" placeholder="Entre com a data" name="data">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Valor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor" name="valor">
	    </div>	    
	    
	    <div class="mb-3 mt-3">
	      <label>Fornecedor:</label>
			  <select class="form-control" id="sel1">
			  	<c:forEach var="f" items="${fornecedores}">
			    	<option>${f.nome}</option>
			  	</c:forEach>
			  </select>	      
	    </div>	    
	    
	    <div class="mb-3 mt-3">
	      <label>Lista de Processos Licitatórios:</label>
		  	<c:forEach var="p" items="${processosLicitatorios}">
				<div class="checkbox">
				  <label><input type="checkbox" value=""> ${p.objetoLicitacao}</label>
				</div>	      
		  	</c:forEach>
	    </div>	    
	    
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>	  
	  
</body>
</html>