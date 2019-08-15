<%
  Cookie cookieTexto = new Cookie("texto", request.getParameter("texto"));
  cookieTexto.setPath("/");
  cookieTexto.setMaxAge(365 * 60 * 60);
  response.addCookie(cookieTexto);

  Cookie cookieFondo = new Cookie("fondo", request.getParameter("fondo"));
  cookieFondo.setPath("/");
  cookieFondo.setMaxAge(365 * 60 * 60);
  response.addCookie(cookieFondo);

  response.sendRedirect("index.jsp");
%>