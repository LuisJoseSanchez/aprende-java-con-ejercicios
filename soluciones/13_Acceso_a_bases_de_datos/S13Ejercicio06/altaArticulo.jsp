<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestisimal","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      
      // Comprueba si el codigo de articulo ya existe
      String consulta = "SELECT COUNT(*) FROM articulo WHERE codigo='"
                + request.getParameter("codigo")
                + "'";
      
      ResultSet coincidencias = s.executeQuery(consulta);
      coincidencias.next();
      
      if (coincidencias.getInt(1) != 0) {
        out.print("<script type=\"text/javascript\">alert(\"Lo siento, el código " + request.getParameter("codigo") + " ya existe\");</script>");
        out.print("<script>document.location = \"index.jsp\"</script>");
      } else {
        // Inserta los datos en la base de datos
        String insercion = "INSERT INTO articulo VALUES ('"
                    + request.getParameter("codigo")
                    + "', '" + request.getParameter("descripcion")
                    + "', " + request.getParameter("preciocompra")
                    + ", " + request.getParameter("precioventa")
                    + ", " + request.getParameter("stock")+ ")";
        out.print(insercion);
        s.execute(insercion);         
        conexion.close();
      }
    %>
    <script>document.location = "index.jsp"</script>
  </body>
</html>
