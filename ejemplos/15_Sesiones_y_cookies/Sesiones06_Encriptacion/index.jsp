<%@page import="javax.xml.bind.DatatypeConverter"%>
<%@page import="java.security.MessageDigest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Encriptación de clave</h1>
    <%
      // Crea una instancia de la clase MessageDigest para manejar los
      // métodos de encriptación.
      MessageDigest md = MessageDigest.getInstance("MD5");
      // Actualiza la instancia con la cadena que queremos encriptar
      md.update("latarara".getBytes());
      // Crea el hash a partir de la cadena
      String hash = DatatypeConverter.printHexBinary(md.digest());
      
      // Muestra por pantalla el hash
      out.print("A la cadena \"latarara\" le corresponde el hash: " + hash + "<br>");
 
      // Comprueba si la clave es correcta
      out.print(
        MessageDigest.isEqual(hash.getBytes(), "26056A29E1E3A2E813EE5575A774B9B0".getBytes())
      );
    %>
  </body>
</html>
