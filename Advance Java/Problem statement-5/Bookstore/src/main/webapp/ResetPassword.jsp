<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
    </head>
        <body bgcolor="yellow">
    
        <form method="post" action="ResetServlet">
        
            <center>
                <table border="1" width="30%" cellpadding="5" bgcolor="yellow" style="color:black">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email"/>
                              <span>*</span>
                        </td>
                        
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="uname"/>
                         <span>*</span>
                         </td>
                       
                        
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>