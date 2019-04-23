<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Iniciar sesión</title>
  </head>
  <body>
    <%
      if (session.getAttribute("usuario") != null) {
        response.sendRedirect("index.jsp");
      }
    %>
    <h1>Iniciar sesión</h1>

    <form action="login.jsp">
      Usuario: <input type="text" name="usuario"><br>
      Contraseña: <input type="password" name="contrasena"><br>
      <input type="submit" value="Enviar">
    </form>
    
    <div style="color: red;">
      <p>
      <%=
        session.getAttribute("error") == null ?
                "" : session.getAttribute("error")
      %>
      <% session.removeAttribute("error"); %>
      </p>
    </div>
  </body>
</html>
