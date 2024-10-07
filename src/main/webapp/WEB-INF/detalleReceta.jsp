<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Detalle Receta</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
	<h1>Detalle de la Receta</h1>
    <c:choose>
        <c:when test="${not empty nombreReceta}">
            <h2>Receta: ${nombreReceta}</h2>
            <h3>Ingredientes:</h3>
            <div class="contenedor">
            	<ul>
	                <c:forEach var="ingrediente" items="${ingredientes}">
	                    <li>${ingrediente}</li>
	                </c:forEach>
            	</ul>
            </div>
            
        </c:when>
        <c:otherwise>
            <p>${mensaje}</p>
        </c:otherwise>
    </c:choose>
</body>
</html>