package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dto.User;

public class GetUser extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		int parseid=Integer.parseInt(id);
		
		DbConnection connection = new DbConnection();
		User user=connection.getUser(parseid);
		req.setAttribute("myUser",user);
		RequestDispatcher dispatcher = req.getRequestDispatcher("Update.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}
	
	
	
	
}
