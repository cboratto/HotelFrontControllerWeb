<%-- 
    Document   : busca_hotel
    Created on : Oct 17, 2014, 7:49:34 PM
    Author     : caioboratto
--%>

<%@page import="hotelaria.modelo.QuartoTipo"%>
<%@page import="hotelaria.modelo.Hotel"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busca Hotel</title>
    </head>
    <body>
        <h1>Buscar Hotel pra Reserva</h1>
        <form method="POST" action="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=Listar&origem=buscaQuartos">            
            <%
                List<Hotel> hoteis = (List<Hotel>) request.getAttribute("lista_hoteis");
                List<QuartoTipo> quartos = (List<QuartoTipo>) request.getAttribute("lista_quartos");
            %>
            <select name="hotelSelecionado">
                <option value="">Selecione o Hotel</option>
                <% for (Hotel h : hoteis) {%>
                <option value="<%=h.getId()%>"><%=h.getNome()%></option>
                <%}%>
            </select>
            <select name="quartoSelecionado">
                <option value="">Selecione o Quarto</option>
                <% for (QuartoTipo q : quartos) {%>
                <option value="<%=q.getId()%>"><%=q.getNomeQuartoTipo()%></option>
                <%}%>
            </select>
            <p><input type="submit"></p>
        </form>
    </body>
</html>
