<%@page import="antlr.Parser"%>
<%@page import="com.ty.dto.User"%>
<%@page import="java.util.List"%>
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
   List<User> lists = (List<User>)request.getAttribute("MyUser");
  %>

<table>
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Password</th>
	<th>Mobile</th>
	<th>Email</th>
	<th>Delete</th>
	<th>Update</th>
</tr>
<%for(User user: lists)
{
%>
<tr>
	<td><%=user.getId() %></td>
	<td><%=user.getName() %></td>
	<td><%=user.getPassword() %></td>
	<td><%=user.getMobile() %></td>
	<td><%=user.getEmail() %></td>
	<td><a href="delete?id=<%=user.getId()%>">Delete</a></td>
	<td><a href="getuser?id=<%=user.getId() %>">Update</a></td>

</tr>
<%} %>
</table>
<td><button type="button"><a href="register.jsp"></</a>Home</button></td></tr>


</body>
</html>