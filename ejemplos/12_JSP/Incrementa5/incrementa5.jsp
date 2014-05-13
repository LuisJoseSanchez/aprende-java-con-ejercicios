<%-- 
    Document   : incrementa5
    Created on : 16-abr-2013, 13:45:03
    Author     : luisjose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        El número introducido más cinco es
        <%
            double resultado;
            resultado = Double.parseDouble(request.getParameter("numeroIntro")) + 5;
            out.print(resultado);
        %>
    </body>
</html>
