package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteUser extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		int parseid=Integer.parseInt(id);
		
		DbConnection connection = new DbConnection();
		boolean co=connection.deleteUser(parseid);
		PrintWriter printWriter=resp.getWriter();
		if(co==true) {
			printWriter.print("<h1>User Deleted</h1>");
		}
		else {
			printWriter.print("<h1>User Not Deleted</h1>");
		}
	}
	
	
	
	
}
