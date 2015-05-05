<%-- 
15. Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los
    primos deberán aparecer en un color diferente al resto.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 15</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <div id="principal">
    <p>
      Esta aplicación genera 100 números aleatorios del 1 al 200. Los primos aparecen
      en color verde.
    </p>
    <p>
      <%
        int n;
        for (int i = 0; i < 100; i++) {
          n = (int)(Math.random() * 200) + 1;
          if (esPrimo(n)) {
            out.print("<span class=\"verde\">" + n + "</span> ");
          } else {
            out.print(n + " ");
          }
        }
      %>
    </p>
    <p>
      Pulsa la tecla <b>F5</b> para ejecutar de nuevo la aplicación.
    </p>
    </div>
  </body>
</html>

<!-- FUNCIONES -->
<%!
  static boolean esPrimo(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
%>
