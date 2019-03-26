<%-- 
    Document   : index
    Created on : Mar 25, 2019, 12:56:45 PM
    Author     : ladynightmare
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora de letra DNI</title>
    </head>
    <body>
        <div>
            <form action="Nif" method="post">
                <% String valor; %>
                <p>DNI: <input type="number" max="99999999" min="0" name="dni" minlength="8" maxlength="8" size="8"></p>
                <p>NIF: </p>
                <button type="submit" value="Calcular">Calcular</button>
            </form>
        </div>
    </body>
</html>
