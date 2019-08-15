<%@page import="clases.Carrito"%>
<%
  int codigo = Integer.parseInt(request.getParameter("codigo"));
  Carrito carrito = (Carrito) session.getAttribute("carrito");
  carrito.meteProductoConCodigo(codigo);
  session.setAttribute("carrito", carrito);
  response.sendRedirect("index.jsp");
%>