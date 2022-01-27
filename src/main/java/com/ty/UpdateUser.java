package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dto.User;

public class UpdateUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("userid");
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobile(Long.parseLong(phone));
		
		DbConnection connection = new DbConnection();
		connection.updateUser(user);
		
		 PrintWriter printWriter=resp.getWriter();
		 printWriter.print("user updated");
		 
		 RequestDispatcher dispatcher= req.getRequestDispatcher("/display");
		 dispatcher.forward(req, resp);
	
		
		
		/*
		 * DbConnection connection = new DbConnection(); connection.updateUser(parseid);
		 * PrintWriter printWriter=resp.getWriter(); if(co==true) {
		 * printWriter.print("<h1>User Deleted</h1>"); } else {
		 * printWriter.print("<h1>User Not Deleted</h1>"); }
		 */
	
	
	
	}
}
