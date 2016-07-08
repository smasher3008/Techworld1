	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
		<head>
				<meta name="viewport" content="width=device-width,initial-scale=1">
				<link rel ="stylesheet"
				href="resources/css/bootstrap.min.css">
	<script 
			src="resources/js/jquery-1.11.1.min.js">
	</script>
	
	<script src="resources/js/bootstrap.min.js"></script>
			<meta charset="ISO-8859-1">
				
				<title>LogIn TechWorld</title>
		
		</head>
	
		
			<body background="resources/image/bg11.jpg" width : 100%>
			
		
			
				<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

			<section class="login">
					<form action="signin" method='POST'>
			
							<div align="center">
					
					<h1 font-family: ""Courier New", Courier, monospace">Explore Techworld</h1>
						
						<%@ include file = "Head.jsp" %>
			
			
			User name *: <p><input path= "username"  type="username" name="username" /></p>
			 
			Password *:<p> <input path= "password" type="password" name="password" /></p>
			 
			
							<input type="submit" value="Submit" />
			
							<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
			
							</div>
					</form>
			 
			
			
			 
			
			</body>
	
	</html>