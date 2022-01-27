package com.ty;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dto.User;

public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String cno=request.getParameter("phone");
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobile(Long.parseLong(cno));
		
		DbConnection connection = new DbConnection();
		connection.saveUser(user);
		response.getWriter().print("<h1>User added</h1>");
		
		response.sendRedirect("index.jsp");
		
		
		
	}
}