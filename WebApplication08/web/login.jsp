<%-- 
    Document   : login
    Created on : Feb 13, 2025, 8:14:13 AM
    Author     : npsan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MainController" method="POST">
            <input type="hidden" name="action" value="login" />
            User ID: <input type="text" name="strUserID" /> <br>
            Password: <input type="password" name="strPassword" /> <br>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
