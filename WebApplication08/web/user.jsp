<%-- 
    Document   : user
    Created on : Feb 13, 2025, 8:50:12 AM
    Author     : npsan
--%>

<%@page import="dto.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UserDTO user = (UserDTO)request.getAttribute("user");
        %>    
        <h1>Welcome <%=user.getFullName()%></h1>
    </body>
</html>
