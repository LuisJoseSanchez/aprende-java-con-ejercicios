<%
  int semana = 60 * 60 * 24 * 7;
  
  Cookie numero = new Cookie("numero", "24");
  numero.setPath("/");
  numero.setMaxAge(semana);
  response.addCookie(numero);
  
  Cookie color = new Cookie("color", "rojo");
  color.setPath("/");
  color.setMaxAge(semana);
  response.addCookie(color);
  
  Cookie secuencia = new Cookie("secuencia", "55 21 48 97 33");
  secuencia.setPath("/");
  secuencia.setMaxAge(semana);
  response.addCookie(secuencia);
%>
