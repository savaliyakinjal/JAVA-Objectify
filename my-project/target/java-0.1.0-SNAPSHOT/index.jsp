<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello App Engine</title>
</head>
<body>
	<h1>Hello App Engine!</h1>

	<table>
		<tr>
			<td colspan="2" style="font-weight: bold;">Available Servlets:</td>
		</tr>
		<tr>
			<td><a href='/hello'>The servlet</a></td>
		</tr>

	</table>

	<h1>Registration</h1>
	
	<form action="saveEmp" method="post" >
	<input type="hidden" name="id">
	<label title="name">Name</label>
	<input type="text">
	<label title="email">Email</label>
	<input type="text">
	<button type="submit">Submit</button>
	
	</form>

<%-- 	<form:form action="addEmp" method="post" modelAttribute="emp">
		<form:hidden path="id" />
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<form:label path="email">Email</form:label>
		<form:input path="email" />

		<input type="submit">
	</form:form> --%>
	<a href="view">view allEmp</a>
</body>
</html>