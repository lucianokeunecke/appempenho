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
	
	  <h2>Cadastro de Processo Licitatório - Tomada de Preço</h2>
	  <form action="/tomadaPreco/incluir" method="post">
	  
		<c:import url="/WEB-INF/jsp/processoLicitatorio/cadastro.jsp"/>
		    
	    <div class="mb-3 mt-3">
	      <label>Permite Subcontratatação:</label>
	      	      
		  <label class="radio-inline">
		  	<input type="radio" name="permiteSubcontratacao" value="true" checked> Sim
		  </label>
		    
		  <label class="radio-inline">
		    <input type="radio" name="permiteSubcontratacao" value="false"> Não
		  </label>
		  
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Condição de Pagamento:</label>
	      <input type="text" class="form-control" placeholder="Entre com a condição de pagamento" name="condicaoPagamento">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Valor Estimado da Dotação Orçamentária:</label>
	      <input type="text" class="form-control" placeholder="Entre com o valor estimado da dotação orçamentária" name="valorEstimadoDotacaoOrcamentaria">
	    </div>
	    
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>	  
	  
</body>
</html>