<%-- 
11. Escribe una aplicación que genere el calendario de un mes. Se pedirá el
    nombre del mes, el año, el texto que queremos que aparezca sobre el
    calendario, el día de la semana en que cae el día 1 y el número de días que
    tiene el mes.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 11</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Generador de calendario</h1>
    <form method="post" action="calendario.jsp">
      Mes
      <select name="mes">
        <option>enero</option>
        <option>febrero</option>
        <option>marzo</option>
        <option>abril</option>
        <option>mayo</option>
        <option>junio</option>
        <option>julio</option>
        <option>agosto</option>
        <option>septiembre</option>
        <option>octubre</option>
        <option>noviembre</option>
        <option>diciembre</option>
      </select>
      Año <input type="number" min="1" name="anio"></br></br>
      El día 1 cae en
      <select name="dia1">
        <option value="1">lunes</option>
        <option value="2">martes</option>
        <option value="3">miércoles</option>
        <option value="4">jueves</option>
        <option value="5">viernes</option>
        <option value="6">sábado</option>
        <option value="7">domingo</option>
      </select></br></br>
      Número de días que tiene el mes <input type="number" min="28" max="31" name="diastotales"></br></br>
      <hr>
      </br></br>
      <input type="submit" value="Aceptar">
    </form>
  </body>
</html>
