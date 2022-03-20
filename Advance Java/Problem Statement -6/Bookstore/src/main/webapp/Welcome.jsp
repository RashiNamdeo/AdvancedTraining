<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   

    <%@page import="com.bookstore.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    
    
    <%
    
    	User user=(User)session.getAttribute("currentUser");
    	if(user==null){
    	response.sendRedirect("Login.jsp");
    	}

    
    %>
    
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Books Records</title>
</head>
<body bgcolor="yellow">
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/bookstore"
        user="root" password=""
    />
    <style>
      #logout {
     
     color: red;
     padding-right: 20px;
     font-size: 30px
    }
    </style>
    <sql:query var="booklist"   dataSource="${myDS}">
        SELECT * FROM books;
    </sql:query>
     <div align="right"> 
        <a id="logout" href="LogoutServlet">Logout</a>
	</div>
    <div align="center">
        <h1>CUSTOMER CART FOR ONLINE BOOK SHOP</h1>
          <h2>List of Books</h2>
        
            <table id="t" border="1" width="30%" cellpadding="5" bgcolor="white" style="color:black">
            <tr>
                  <th colspan="4"><br>Books <br><br></th>
            
            </tr>
            <tr>
                <th> Book ID </th>
                <th> Book Name </th>
                <th> Author </th>
                <th> Price </th>
            </tr>
            <c:forEach var="book" items="${booklist.rows}">
                <tr style="text-align:center">
                    <td><a href="BookInfo.jsp?bid=${book.Book_id}"><c:out value="${book.Book_id}" /></a></td>
                    <td id="book_name"><c:out value="${book.Book_name}" /></td>
                    <td id="author"><c:out value="${book.Author}" /></td>
                    <td id="price"><c:out value="${book.Price}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <script>
    
		/* var table = document.getElementById('t'),rIndex;
		for(var i=0;i<table.rows.length;i++){
				table.rows[i].onclick=function(){
					rIndex=this.rowIndex;
					console.log(rIndex);
					
					
					window.location.replace("BookInfo.jsp");
					alert($(this).text())
					}
			}   	 */		
		

    </script>
    
</body>
</html>