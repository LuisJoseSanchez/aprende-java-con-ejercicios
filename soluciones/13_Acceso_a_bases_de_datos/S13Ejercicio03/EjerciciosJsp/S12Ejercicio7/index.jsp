<%-- 
    7. Combina las dos aplicaciones anteriores en una sola de tal forma que en la
       página principal aparezcan dos formularios y se pueda elegir pasar de
       euros a pesetas o de pesetas a euros según dónde introduzcamos el valor y
       el botón que pulsemos. Adorna la página con alguna foto o dibujo.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 7</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>conversor de moneda</h1>
    <form class="dinero" method="post" action="conversor.jsp">
      cantidad</br><input type="number" min="0" step="0.01" name="cantidad"></br></br>
      <input type="radio" name="cambio" value="eurosEnPesetas" checked="checked"> euros -> pesetas</br></br>
      <input type="radio" name="cambio" value="pesetasEnEuros"> pesetas -> euros</br></br>
      <input type="submit" value="Convertir">
    </form>
  </body>
</html>
