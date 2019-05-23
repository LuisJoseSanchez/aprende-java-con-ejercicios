<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Máquina de helados</title>
    <style>
      .contenedor {
        display: flex;
        width: 100%;
        justify-content: center;
      }
      .tarrina {
        width: 320px;
        border-width: 6px;
        border-radius: 4px;
        border-color: brown;
        border-style: solid;
        border-top-color: white;
      }
    </style>
  </head>
  <body>
    <%
      int chocolate = Integer.parseInt(request.getParameter("chocolate"));
      int fresa = Integer.parseInt(request.getParameter("fresa"));
      int vainilla = Integer.parseInt(request.getParameter("vainilla"));
      
      int vacio = 100 - (chocolate + fresa + vainilla);
      
      if (chocolate + fresa + vainilla > 100) {
        session.setAttribute("error", "La suma de porcentajes no pueden ser mayor que el 100%");
        response.sendRedirect("index.jsp");
      } else {
    %>
    <h1 style="text-align: center;">Aquí tiene su tarrina de helado</h1>
    
    <div class="contenedor">
      <div class="tarrina" style="">

        <!-- Espacio vacío hasta completar el tamaño de la tarrina -->
        <div style="height: <%= vacio %>px"></div>
        
        <% if (chocolate > 0) { %>
        <!-- Chocolate -->
        <div style="height: <%= chocolate %>px; background-color: #57331b;">Chocolate <%= chocolate %>%</div>
        <% } %>
        
        <% if (fresa > 0) { %>
        <!-- Fresa -->
        <div style="height: <%= fresa %>px; background-color: #ecacd6;">Fresa <%= fresa %>%</div>
        <% } %>
        
        <% if (vainilla > 0) { %>
        <!-- Vainilla -->
        <div style="height: <%= vainilla %>px; background-color: #f7d88e;">Vainilla <%= vainilla %>%</div>
        <% } %>
        
      </div>
    </div>
    <%
      }
    %>
  </body>
</html>
