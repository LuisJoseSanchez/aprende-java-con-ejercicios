<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/materialize.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
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
    </body>
</html>
