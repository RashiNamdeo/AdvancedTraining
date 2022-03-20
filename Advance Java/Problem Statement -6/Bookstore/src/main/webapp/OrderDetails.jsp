<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shopping Cart</title>
</head>
<body bgcolor="yellow">



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


	<form method="post" action="OrderConfirm.jsp">
		<center>
			<h1>SHOPPING CART FOR BOOK STORE</h1>
			<h2>ORDER CONFIRMATION</h2>
			<table width="22%" cellpadding="3">


				<tbody>
					<tr>
						<td><b>Customer Name :</b></td>
						<td><input type="text" name="cname" /></td>
					</tr>
					<tr>
						<td><b>Address :</b></td>
						<td><input type="text" name="address"  /></td>
					</tr>
					<tr>
						<td><b>Phone no :</b></td>
						<td><input type="text" name="no" /></td>
					</tr>

				</tbody>
			</table>
			<h3>Purchased book details are as follow :</h3>
			<table>
				<tbody>
					<tr>
						<td><b>Book ID : C2</b></td>
					</tr>


					<tr>
						<td><b> Book Name : Thinking in Java</b></td>
					</tr>


					<tr>
						<td><b>Author : Thinking in Java </b>
						<td>
					</tr>


					<tr>
						<td><b>Price :Rs900 </b></td>
					</tr>

					<tr>
						<td><b>Quantity : 3 </b> </b></td>
					</tr>
				</tbody>
			</table>

			<centre>
			<tr>
				<td><input type="submit" value="Confrim" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Cancel" /></td>

			</tr>
			</centre>
		</center>

	</form>
</body>
</html>