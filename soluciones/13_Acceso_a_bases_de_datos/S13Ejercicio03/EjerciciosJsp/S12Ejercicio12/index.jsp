<%-- 
12. Mejora la aplicación anterior de tal forma que no haga falta introducir el
    día de la semana en que cae el día 1 y el número de días que tiene el mes.
    El programa debe deducir estos datos del mes y el año.
    Pista: puedes usar la clase Calendar (java.util.Calendar).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 12</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Generador de calendario</h1>
    <form method="post" action="calendario.jsp">
      mes
      <select name="mes">
        <option value="1">enero</option>
        <option value="2">febrero</option>
        <option value="3">marzo</option>
        <option value="4">abril</option>
        <option value="5">mayo</option>
        <option value="6">junio</option>
        <option value="7">julio</option>
        <option value="8">agosto</option>
        <option value="9">septiembre</option>
        <option value="10">octubre</option>
        <option value="11">noviembre</option>
        <option value="12">diciembre</option>
      </select> 
      &nbsp;año <input type="number" name="anio" size="4"> 
      &nbsp;<input type="submit" value="Aceptar">
    </form>
  </body>
</html>
