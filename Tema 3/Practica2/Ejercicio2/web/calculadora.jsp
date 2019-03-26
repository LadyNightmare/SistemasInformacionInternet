<%-- 
    Document   : nif
    Created on : Mar 25, 2019, 1:12:22 PM
    Author     : ladynightmare
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora de divisores</title>
    </head>
    <body>
        
        <% int number = Integer.parseInt(request.getParameter("numero"));%>
        
        <table border="1px">
            
            <th bgcolor="black" style="color:white">Divisores de <%=number%></th>
            
            <% for (int i = 1; i <= number; ++i) {
            
            if(number%i == 0) {
                
                out.println("<tr align=\"center\">");
                out.println("<td>" +i + "</td>");
                out.println("</tr>");
                
            }
            
        } %>
            
        </table>
            
        
        <div>
        </div>
    </body>
</html>
