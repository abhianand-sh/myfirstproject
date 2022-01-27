<%@page import="com.ty.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	User user = (User) request.getAttribute("myUser");
	%>
	<form action="update">
		<table>
		<tr>
			<td>Id</td>
			<td><input type="number" name="userid" value="<%=user.getId()%>" ></td>
		</tr>
			<tr>
				<td>username :</td>
				<td><input type="text" name="username" value="<%=user.getName() %>"></td>
			</tr>
			<tr>
				<td>password :</td>
				<td><input type="password" name="password" value="<%=user.getPassword()  %>"></td>
			</tr>
			<tr>
				<td>email :</td>
				<td><input type="email" name="email" value="<%= user.getEmail() %>"></td>
			</tr>
			<tr>
				<td>phone :</td>
				<td><input type="number" name="phone" value="<%= user.getMobile() %>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update User" ></td>
				</tr>
		</table>
		<button type="button"><a href="display"></</a>view User Detail</button>
</body>
</html>