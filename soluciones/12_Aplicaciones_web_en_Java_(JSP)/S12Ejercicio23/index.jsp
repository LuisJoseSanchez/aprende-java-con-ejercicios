<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tres en raya</title>
    <style>
      td {
        border: lightgray solid 1px;
      }
    </style>
  </head>
  <body>
    <%
      String[][] n = new String[3][3];

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          n[i][j] = "vacio";
        }
      }

      int circulos = 0;
      do {
        int i = (int) (Math.random() * 3);
        int j = (int) (Math.random() * 3);
        if (n[i][j].equals("vacio")) {
          n[i][j] = "circulo";
          circulos++;
        }
      } while (circulos < 3);

      int cruces = 0;
      do {
        int i = (int) (Math.random() * 3);
        int j = (int) (Math.random() * 3);
        if (n[i][j].equals("vacio")) {
          n[i][j] = "cruz";
          cruces++;
        }
      } while (cruces < 3);
    %>
    <table>
      <%
      for (int i = 0; i < 3; i++) {
      %>
      <tr>
        <%
        for (int j = 0; j < 3; j++) {
        %>
          <td><img src="img/<%= n[i][j] %>.png"></td>
        <%
        }
      }
      %>
    </table>
  </body>
</html>
