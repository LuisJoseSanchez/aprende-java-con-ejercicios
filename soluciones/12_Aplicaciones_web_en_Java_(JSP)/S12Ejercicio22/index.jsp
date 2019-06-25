<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Menú</title>
  </head>
  <body>

    <%
      String[] imagenes = {"hamburguesa", "pasta", "pizza", "quinoa", "agua", "cerveza", "refresco"};
    %>

    <h1 style="text-align: center;">Pide la comida más sana a Domicilio</h1>

    <form action="pedido.jsp">
      <div style="display: flex; width: 100%; justify-content: center;">
        <%
          for (int i = 0; i < 4; i++) {
        %>
        <div>
          <img src="imagenes/<%= imagenes[i]%>.png" width="200px"><br>
          <input type="number" name="comida<%= i%>" value="0" min="0">
        </div>
        <%
          }
        %>
      </div>    

      <div style="display: flex; width: 100%; justify-content: center;">
        <%
          for (int i = 4; i < 7; i++) {
        %>
        <div>
          <img src="imagenes/<%= imagenes[i]%>.png" width="100px"><br>
          <input type="number" name="comida<%= i%>" value="0" min="0">
        </div>
        <%
          }
        %>
      </div>  
      <br><br>
      <div style="display: flex; width: 100%; justify-content: center;">
        <button style="text-align: center" type="submit">Hacer pedido</button>
      </div> 
    </form>
  </body>
</html>
