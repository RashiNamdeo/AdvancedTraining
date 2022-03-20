<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.bookstore.entity.*" %>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Confirmed</title>
    </head>
        <body bgcolor="yellow">
    
     <%
    
    	User user=(User)session.getAttribute("currentUser");
    	if(user==null){
    	response.sendRedirect("Login.jsp");
    	}

    
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
    
            <center>
                <h1> SHOPPING CART FOR BOOK STORE </h1> 
                <h2> Your order has been confirmed. The Books Shall be delivered within 2 days.</h2>
               <h3>Thank You for online book shopping .</h3> 
                <a href="Welcome.jsp">click here to go to main page</a>
            </center>
    </body>
</html>>