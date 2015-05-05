<%-- 
  13. Pasa el test de infidelidad de programa en consola a aplicación web.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 13</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Test de infidelidad</h1>
    <div id="principal">
    <form method="post" action="cuestionario.jsp">
      1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.</br>
      <input type="radio" name="p1" value="3"> verdadero</input></br>
      <input type="radio" name="p1" value="0"> falso</input></br></br>
      2. Ha aumentado sus gastos de vestuario</br>
      <input type="radio" name="p2" value="3"> verdadero</input></br>
      <input type="radio" name="p2" value="0"> falso</input></br></br>
      3. Ha perdido el interés que mostraba anteriormente por ti</br>
      <input type="radio" name="p3" value="3"> verdadero</input></br>
      <input type="radio" name="p3" value="0"> falso</input></br></br>
      4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)</br>
      <input type="radio" name="p4" value="3"> verdadero</input></br>
      <input type="radio" name="p4" value="0"> falso</input></br></br>
      5. No te deja que mires la agenda de su teléfono móvil</br>
      <input type="radio" name="p5" value="3"> verdadero</input></br>
      <input type="radio" name="p5" value="0"> falso</input></br></br>
      6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante</br>
      <input type="radio" name="p6" value="3"> verdadero</input></br>
      <input type="radio" name="p6" value="0"> falso</input></br></br>
      7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a</br>
      <input type="radio" name="p7" value="3"> verdadero</input></br>
      <input type="radio" name="p7" value="0"> falso</input></br></br>
      8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo</br>
      <input type="radio" name="p8" value="3"> verdadero</input></br>
      <input type="radio" name="p8" value="0"> falso</input></br></br>
      9. Has notado que últimamente se perfuma más</br>
      <input type="radio" name="p9" value="3"> verdadero</input></br>
      <input type="radio" name="p9" value="0"> falso</input></br></br>
      10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo</br>
      <input type="radio" name="p10" value="3"> verdadero</input></br>
      <input type="radio" name="p10" value="0"> falso</input></br></br>
      <input type="submit" value="Evaluar cuestionario">
    </form>
    </div>
  </body>
</html>
