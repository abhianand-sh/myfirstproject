package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.dto.User;

/**
 * Servlet implementation class LoginUser
 */
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		DbConnection connection = new DbConnection();
		User user = connection.validate(username, password);
		//request.getSession().setAttribute(, user)
		
		PrintWriter pw = response.getWriter();
		if(username.equals(user.getName()) && password.equals(user.getPassword()))
		{
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute(username,user.getName());
			
			response.sendRedirect("display");
		}
		else
		{
			response.sendRedirect("register.jsp");


		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
