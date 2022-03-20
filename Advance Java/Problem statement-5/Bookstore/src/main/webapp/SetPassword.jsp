<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Infromation here</title>
    </head>
        <body bgcolor="yellow">
    
        <form method="post" action="SetPasswordServlet">
            <center>
                   <h1>Set Password Page</h1>
                <table border="1" width="30%" cellpadding="5" bgcolor="yellow" style="color:black">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Enter New Password</td>
                        <td><input type="password" name="pass" required/><span>*</span></td>
                        
                    </tr>
                    <tr>
                        <td>Confirm Password</td>
                        <td><input type="password" name="cpass" required/><span>*</span></td>
                        
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