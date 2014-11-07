<%-- 
    Document   : efetuar_reserva
    Created on : Nov 7, 2014, 8:42:30 PM
    Author     : caioboratto
--%>

<%@page import="hotelaria.modelo.Reserva"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reserva</title>
    </head>
    <body>
        <h1>Reserva efetuada com sucesso</h1>
        <% Reserva reserva = (Reserva) request.getAttribute("reserva");
            if (reserva.getCodReserva() != null) {
        %> 
        <p><%=reserva.getCodReserva()%></p>
        <%
        } else {
        %> 
        <p>ERRO</p>
        <%
            }

        %>
    </body>
</html>
