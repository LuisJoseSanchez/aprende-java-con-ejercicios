<%-- 
  10. Realiza un cuestionario con 10 preguntas tipo test sobre las asignaturas
      que se imparten en el curso. Cada pregunta acertada sumará un punto. El
      programa mostrará al final la calificación obtenida. Pásale el cuestionario
      a tus compañeros y pídeles que lo hagan para ver qué tal andan de
      conocimientos en las diferentes asignaturas del curso. Utiliza radio
      buttons en las preguntas del cuestionario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 10</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Cuestionario 1º DAW</h1>
    <form method="post" action="calcula_nota.jsp">
      1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?</br>
      <input type="radio" name="p1" value="0"> int</input></br>
      <input type="radio" name="p1" value="1"> double</input></br>
      <input type="radio" name="p1" value="0"> float</input></br></br>

      2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?</br>
      <input type="radio" name="p2" value="0"> XML</input></br>
      <input type="radio" name="p2" value="0"> SELECT</input></br>
      <input type="radio" name="p2" value="1"> SQL</input></br></br>

      3. Para insertar un hiperenlace en una página se utiliza la etiqueta...</br>
      <input type="radio" name="p3" value="0"> href</input></br>
      <input type="radio" name="p3" value="1"> a</input></br>
      <input type="radio" name="p3" value="0"> link</input></br></br>

      4. ¿En qué directorio se encuentran los archivos de configuración de Linux?</br>
      <input type="radio" name="p4" value="1"> /etc</input></br>
      <input type="radio" name="p4" value="0"> /config</input></br>
      <input type="radio" name="p4" value="0"> /cfg</input></br></br>

      5. ¿Cuál de las siguientes memorias es volátil?</br>
      <input type="radio" name="p5" value="1"> RAM</input></br>
      <input type="radio" name="p5" value="0"> EPROM</input></br>
      <input type="radio" name="p5" value="0"> ROM</input></br></br>

      6. En Java, para definir una clase como subclase de otra se utiliza...</br>
      <input type="radio" name="p6" value="1"> extends</input></br>
      <input type="radio" name="p6" value="0"> inherit</input></br>
      <input type="radio" name="p6" value="0"> subclass</input></br></br>

      7. ¿Java soporta la herencia múltiple?</br>
      <input type="radio" name="p7" value="0"> Sí</input></br>
      <input type="radio" name="p7" value="1"> No</input></br>
      <input type="radio" name="p7" value="0"> A veces</input></br></br>

      8. ¿Qué significan las siglas CSS?</br>
      <input type="radio" name="p8" value="0"> Computer Style Sheets</input></br>
      <input type="radio" name="p8" value="0"> Creative Style Sheets</input></br>
      <input type="radio" name="p8" value="1"> Cascading Style Sheets</input></br></br>

      9. ¿Qué propiedad se utiliza en CSS para cambiar el color de fondo?</br>
      <input type="radio" name="p9" value="0"> bgcolor:</input></br>
      <input type="radio" name="p9" value="0"> color:</input></br>
      <input type="radio" name="p9" value="1"> background-color:</input></br></br>

      10. ¿Cómo se muestran los hiperenlaces sin subrayar?</br>
      <input type="radio" name="p10" value="0"> a {text-decoration:no underline}</input></br>
      <input type="radio" name="p10" value="0"> a {underline:none}</input></br>
      <input type="radio" name="p10" value="1"> a {text-decoration:none}</input></br></br>

      <input type="submit" value="Evaluar cuestionario">
    </form>
  </body>
</html>
