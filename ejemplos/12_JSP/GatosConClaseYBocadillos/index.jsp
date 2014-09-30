<%-- index.jsp (proyecto GatosConClaseYBocadillos) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="daw1.Gato"%>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Gatos con clase y bocadillos</title>
		  <link rel="stylesheet" type="text/css" href="estilos.css" />
    </head>
    <body>
      <h1>Gatos con clase</h1>
      <hr>
      <%
        Gato g1 = new Gato("Pepe", "gato.jpg");
        Gato g2 = new Gato("Garfield", "garfield.jpg");
        Gato g3 = new Gato("Tom", "tom.png");

        out.println(g1);
        out.println(g2);
        out.println(g3);
        out.println(g1.maulla());
        out.println(g2.come("sardinas"));
      %>
    </body>
</html>
