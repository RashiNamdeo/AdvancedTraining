package com.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.dao.UserDao;
import com.bookstore.db.jdbcconnection;
import com.bookstore.entity.User;

/**
 * Servlet implementation class SetPasswordServlet
 */
public class SetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SetPasswordServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("pass");
		String confirmpass = request.getParameter("cpass");

		UserDao dao = new UserDao(jdbcconnection.getConnection());

		int u;
		try {
			u = dao.setPassword(pass);

			if (!pass.equals(confirmpass)) {
				RequestDispatcher rd = request.getRequestDispatcher("SetPassword.jsp");
				rd.include(request, response);
				out.println("<center>Password Not Match!!</center>");

			} else {
				// success

				response.sendRedirect("passwordSet.jsp");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
