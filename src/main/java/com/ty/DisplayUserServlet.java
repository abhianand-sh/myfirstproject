package com.ty;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dto.User;

public class DisplayUserServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DbConnection connection = new DbConnection();
		List<User> lists = connection.displayUser();
		req.setAttribute("MyUser", lists);
		RequestDispatcher dispatcher = req.getRequestDispatcher("DisplayUser.jsp");
		dispatcher.forward(req, resp);
		
		
	}
}
