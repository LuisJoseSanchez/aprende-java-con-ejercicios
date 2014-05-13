<%-- 
    Document   : index
    Created on : 18-abr-2013, 8:57:45
    Author     : luisjose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paso de cadena</title>
    </head>
    <body>
        <h1>Pasando una cadena de caracteres</h1>
        <form method="post" action="frase.jsp">
            Introduzca el nombre de una fruta:
            <input type="text" name="cadenaIntro">
            <input type="submit" value="OK">
        </form>
    </body>
</html>
