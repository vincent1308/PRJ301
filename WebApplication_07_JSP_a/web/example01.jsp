<%-- 
    Document   : example01
    Created on : Feb 10, 2025, 7:37:56 AM
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
        <%
            for (int i = 2; i <= 9; i++) {
                %>
                <hr>
                <h3>Cửu chương <%=i%></h3>
                <%
                    for (int j = 1; j <= 10; j++) {
                        %>   
                        <%=i%> x <%=j%>=<%=(i*j)%><br/>
                        <%    
                        }
                }
        %>    
    </body>
</html>
