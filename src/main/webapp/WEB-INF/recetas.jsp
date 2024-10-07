<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Recetas</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
	<h1>Lista de Recetas</h1>
	<div class="contenedor">
		<ul>
	        <c:forEach items="${listaRecetas}" var="receta">
	            <li>${receta}</li>
	        </c:forEach>
    	</ul>
	</div>
    

</body>
</html>