<%-- 
    Document   : index
    Created on : 16-abr-2013, 12:42:33
    Author     : luisjose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba variable</title>
    </head>
    <body>
        <% int x = 3;  %>
        <h<% out.print(x); %>>hola</h<% out.print(x); %>>
    </body>
</html>
