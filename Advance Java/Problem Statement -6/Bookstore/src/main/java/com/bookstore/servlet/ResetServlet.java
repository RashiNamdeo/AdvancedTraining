package com.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.dao.UserDao;
import com.bookstore.db.jdbcconnection;
import com.bookstore.entity.User;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class ResetServlet
 */
public class ResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String useremail=request.getParameter("email");
		String useruname=request.getParameter("uname");
		
		UserDao dao= new UserDao(jdbcconnection.getConnection());
		
		User u=dao.resetPassword(useremail, useruname);
		
		if(u==null) {
			
			out.println("Invalid Details!!.. Try again");
			
			
			
			response.sendRedirect("ResetPassword.jsp");
			
			
		}
		else {
			//  success
			
			response.sendRedirect("SetPassword.jsp");
			
		}
		
		
		
		
	}

}
