<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bookstore.dao.*"%>
<%@page import="com.bookstore.db.*"%>
<%@page import="com.bookstore.entity.*"%>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shopping Cart</title>
</head>
<body bgcolor="yellow">


 <%
    
    	User user=(User)session.getAttribute("currentUser");
    	if(user==null){
    	response.sendRedirect("Login.jsp");
    	}

    
    %>



	<%
    	
    	 	String Book_id=request.getParameter("bid");
			UserDao dao= new UserDao(jdbcconnection.getConnection());
			Books book=dao.getBookDetailsById(Book_id);
    	
    	
    	
    %>
    
    
     <style>
      #logout {
     
     color: red;
     padding-right: 20px;
     font-size: 30px
    }
    </style>
    
     <div align="right"> 
        <a id="logout" href="LogoutServlet">Logout</a>
	</div>
	<form method="post" action="OrderDetails.jsp">
		<center>
			<h1>SHOPPING CART FOR BOOK STORE</h1>
			<h2>Selected Book Details are displayed .</h2>
			<table width="40%" cellpadding="6">

				<tbody>
					<tr>
						<td><b>Book ID :<%=book.getBook_id() %></b><br></td>
					</tr>

					<tr>
						<td><b> Book Name :<%=book.getBook_name()%></b><br></td>
					</tr>

					<tr>
						<td><b>Author :<%=book.getAuthor() %></b><br>
						<td>
					</tr>


					<tr>
						<td><b>Price: <%=book.getPrice() %></b><br></td>
					</tr>

					<tr>
						<td><b>Enter Quantity :<input type="text" name="qau" />
						</b></td>
					</tr>

				</tbody>
			</table>
			<tr>
				<td><input type="submit" value="Purchase" /> <input
					type="submit" value="Cancel" /></td>

			</tr>

		</center>

	</form>
</body>
</html>