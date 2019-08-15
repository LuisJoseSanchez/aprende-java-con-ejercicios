<%
  Cookie cookie = new Cookie("idioma", request.getParameter("idioma"));
  cookie.setPath("/");
  cookie.setMaxAge(365 * 60 * 60);
  response.addCookie(cookie);

  response.sendRedirect("index.jsp");
%>
