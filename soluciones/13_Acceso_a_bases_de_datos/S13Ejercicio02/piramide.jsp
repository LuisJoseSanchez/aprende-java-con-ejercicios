<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Materialize -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  </head>
    <body>
      <div class="container center">
        <%
          int alturaTotal = Integer.parseInt(request.getParameter("altura"));
          int altura = 1;
          int i = 0;

          while (altura <= alturaTotal) {
            // pinta la línea
            for (i = 1; i < altura*2; i++) {
              out.print("<img src=\"gatoloco.png\" width=\"40\">");
            }
            out.println("</br>");
            altura++;
          } // while
        %>
      </div>
      <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <!-- Materialize -->
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
    </body>
</html>
