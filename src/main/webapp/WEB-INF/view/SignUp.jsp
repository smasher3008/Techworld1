	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sign up in the world of Gigabytes</title>
	</head>
	
	<style>
	body {background color : Skyblue}
	h1 {colour : yellow}
	p {color : red}
	</style>
	
	<body background="resources/image/Background-Images.jpg">
	
		<%@ include file = "Head.jsp" %>
		
	
	<form tag="Create Login">
	<div align="center">
	<font color="yellow">
	<h1>EntEr TECHWORLD</h1>
	</font>
					<font color="white"> 
	<!-- Username *: <p><input path ="username" /></p>
	 
	Password *:<p> <input type="password" name="pwd" /></p>
	 
	Email *:<p> <input type="email" name="email" /></p>
	 
	Contact no.:<p> <input type="telephone" name="tel" /></p>
	 
	Address *: <p><input type="address" name="add" /></p>
	 
	<p><input type="submit" value="Submit" /></p>
	\ -->
	
	<p><p>Note: Please make sure your details are correct before submitting form and that all fields marked with * are completed!.</p></p>
	</div>
	</form>
	<form:form method="POST" action="InsertUser" modelAttribute="User">
   <table align = "center">
    <tr>
        <td><form:label path="name"  style="font-family:Comic Sans MS">Name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="username"  style="font-family:Comic Sans MS">Username</form:label></td>
        <td><form:input path="username" /></td>
    </tr>
    
    <tr>
        <td><form:label path="password"  style="font-family:Comic Sans MS">password</form:label></td>
        <td><form:input path="password" /></td>
    </tr>
    <tr>
        <td><form:label path="contactno"  style="font-family:Comic Sans MS">contactno</form:label></td>
        <td><form:input path="contactno" /></td>
    </tr>
    <tr>
        <td><form:label path="email"  style="font-family:Comic Sans MS">email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="address"  style="font-family:Comic Sans MS">address</form:label></td>
        <td><form:input path="address" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"  style="font-family:Comic Sans MS"/>
        </td>
    </tr>
</table>  
</form:form>
	 
	
	
	 
	
	</body>
	</html>