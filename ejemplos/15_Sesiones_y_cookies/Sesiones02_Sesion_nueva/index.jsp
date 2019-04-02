<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesión nueva</title>
    </head>
    <body>
        Sesión nueva: <%= session.isNew() %><br>
        Recarga la página con F5
    </body>
</html>
