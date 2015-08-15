<%-- 
  17. Realiza un configurador del interior de un vehículo. El usuario puede
      elegir, mediante un formulario, el color de la tapicería – blanco, negro
      o berengena - y el material de las molduras – madera o carbono. Se debe
      mostrar el interior del coche tal y como lo quiere el usuario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 17</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Configurador de vehículo</h1>
    <form method="get" action="coche.jsp">
      Tapicería:
      <select name="tapiceria">
        <option value="negro" selected="selected">Cuero negro</option>
        <option value="berengena">Color berengena</option>
        <option value="blanco">Blanco marfil</option>
      </select>
      <br>
      <br>
      Tipo de moldura interior:
      <select name="moldura">
        <option value="carbono" selected="selected">Fibra de carbono</option>
        <option value="madera">Madera de nogal</option>
      </select>
      <br>
      <br>
      <input type="submit" value="Aceptar">
    </form>
  </body>
</html>
