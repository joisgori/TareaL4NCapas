<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tarea 4</title>
</head>
<body>
	<h1>${message}</h1>
	<form:form action="${pageContext.request.contextPath}/formData" method ="POST" modelAttribute="product">
		
		<label>Ingrese un nombre: </label> 
		<form:input path="name" type="text" name="name"/>
		<form:errors path="name" cssStyle="color:#E43A15;"></form:errors><br>
		
		<label>Ingrese una marca: </label> 
		<form:input path="brand" type="text" name="brand"/>
		<form:errors path="brand" cssStyle="color:#E43A15;"></form:errors><br>
		
		<label>Ingrese una descripción: </label> 
		<form:input path="description" type="text" name="description"/>
		<form:errors path="description" cssStyle="color:#E43A15;"></form:errors><br>
		
		<label>Ingrese una categoría: </label> 
		<form:input path = "category" type="text" name ="category"/>
		<form:errors path="category" cssStyle="color:#E43A15;"></form:errors><br>
		
		<label>Ingrese un precio: </label> 
		<form:input path="price" type="text" name="price"/>
		<form:errors path="price" cssStyle="color:#E43A15;"></form:errors><br>
		
		<label>Ingrese una fecha de vencimiento: </label> 
		<form:input path="date" type="text" name="date" placeholder="DD/MM/YYYY"/>
		<form:errors path="date" cssStyle="color:#E43A15;"></form:errors><br>
		
		<input type="submit" value="Agregar producto"/>
	</form:form>
</body>
</html>