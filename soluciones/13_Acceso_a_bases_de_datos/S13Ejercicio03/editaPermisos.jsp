<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Materialize -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <title>Permisos</title>
  </head>
  
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/seguridad3","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      String consulta = "SELECT ejercicio FROM permiso WHERE usuario='"
                          + request.getParameter("usuario") + "'";

      ResultSet listado = s.executeQuery(consulta);

      ArrayList<Integer> a = new ArrayList<Integer>();

      while (listado.next()) {
        a.add(listado.getInt("ejercicio"));
      }

      conexion.close();
    %>
            
    <div class="container">
      <div class="row"></div>
      <div class="card">
        <h5 class="center">Permisos</h5>
        <table class="bordered centered responsive-table">
            <thead><th>Usuario</th><th>1</th><th>2</th><th>3</th><th>4</th><th>5</th><th>6</th><th>7</th><th>8</th><th>9</th><th>10</th><th>11</th><th>12</th><th>13</th><th>14</th><th>15</th><th>16</th><th>17</th><th>18</th><th>19</th><th>20</th></thead>
            <tr><td><%=request.getParameter("usuario") %></td>
            <form method="post" action="grabaPermisos.jsp">
            <%
              for(int i = 1; i < 21; i++) {
                %>
                <div class="input-field">
                <td>
                <input type="checkbox" name="ejer<%=i %>" id="ejer<%=i %>"
                <%
                if (a.contains(i)) {
                  out.print(" checked=\"checked\"");
                }
                %>
                ><label for="ejer<%=i %>"></label>
                </td>
                </div>
              <%
              }
            %>
            
            <td>              
              </div>
              <input type="hidden" name="usuario" value="<%=request.getParameter("usuario") %>">
              <button class="btn waves-effect waves-light center" type="submit" name="aceptar">
                <i class="material-icons">check_circle</i>
              </button>
            </td></tr>
        </table>
      </div>
    </div>
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <!-- Materialize -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
    <script>
      $(document).ready(function() {
        $('select').material_select();
      });
    </script>
    </body>
</html>
