<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gestisimal</title>
  </head>
  <body>
    <div class="principal">
      <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestisimal", "root", "root");
        Statement s = conexion.createStatement();

        request.setCharacterEncoding("UTF-8");

        s.execute("UPDATE articulo SET descripcion='" + request.getParameter("descripcion") + "', precio_compra=" + request.getParameter("preciocompra") + ", precio_venta=" + request.getParameter("precioventa") + ", stock=" + request.getParameter("stock") + " WHERE codigo=" + request.getParameter("codigo"));

        conexion.close();
      %>
      <script>document.location = "index.jsp"</script>
  </body>
</html>
