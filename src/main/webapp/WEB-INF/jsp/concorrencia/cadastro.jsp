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
	
	  <h2>Cadastro de Processo Licitatório - Concorrência</h2>
	  <form action="/concorrencia/incluir" method="post">
	  
		<c:import url="/WEB-INF/jsp/processoLicitatorio/cadastro.jsp"/>
		    
	    <div class="mb-3 mt-3">
	      <label>Eletrônica:</label>
	      	      
		  <label class="radio-inline">
		  	<input type="radio" name="eletronica" value="true" checked> Sim
		  </label>
		    
		  <label class="radio-inline">
		    <input type="radio" name="eletronica" value="false"> Não
		  </label>
		  
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Prazo de Execução:</label>
	      <input type="text" class="form-control" placeholder="Entre com o prazo de execução" name="prazoExecucao">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Valor Mínimo de Capital:</label>
	      <input type="number" step="0.01" value="0.00" placeholder="0.00" class="form-control" placeholder="Entre com o valor mínimo de capital" name="valorMinimoCapital">
	    </div>
	    
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>	  
	  
</body>
</html>