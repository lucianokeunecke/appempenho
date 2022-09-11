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