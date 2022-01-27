<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>
<%
String name = (String)session.getAttribute("username");
if(name == null)
{
	response.sendRedirect("index.jsp");	
}
%>
<h2>User Registration</h2>
<form action="register">
<table>
<tr><td>full name :</td><td><input type="text" name="fullname"></td></tr>
<tr><td>username  :</td><td><input type="text" name="username"></td></tr>
<tr><td>password  :</td><td><input type="password" name="password"></td></tr>
<tr><td>email     :</td><td><input type="email" name="email"></td></tr>
<tr><td>phone     :</td><td><input type="number" name="phone"></td></tr>
<tr><td><input type="submit" name="register" value=" register "></td>
<td><button type="button"><a href="display"></</a>view User Detail</button></td></tr>
<td><button type="button"><a href="index.jsp"></</a>Login</button></td></tr>
</table>
</form>
</body>
</html>