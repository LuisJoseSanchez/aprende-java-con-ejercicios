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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>¡Hola Caracola!</h1>
        <% out.print("<b><i>"); %>
        Esta línea se ha puesto en negrita y cursiva mediante Java.
        <% out.print("</i></b>"); %>
    </body>
</html>
