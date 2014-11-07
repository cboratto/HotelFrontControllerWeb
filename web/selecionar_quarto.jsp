<%-- 
    Document   : selecionar_reserva
    Created on : Nov 7, 2014, 7:40:45 PM
    Author     : caioboratto
--%>

<%@page import="hotelaria.modelo.Quarto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selecionar Reserva</title>
    </head>
    <body>
        <h1>Selecione a sua Reserva</h1>
        <form method="POST" action="/HotelFrontControllerWeb31328334/FrontControllerServlet?control=FazReserva">
            <table border="1">
                <tr><th>Numero do Quarto</th><th>Nome Hotel</th><th>Logradouro</th><th>Tipo Quarto</th><th>Capacidade Maxima</th></tr>

                <%
                    List<Quarto> quartos = (List<Quarto>) request.getAttribute("lista_quartos_disponiveis");
                    for (Quarto q : quartos) {
                               
                                
                %>
                <tr>
                    <td><%=q.getId()%></td>
                    <td><%=q.getHotel().getNome()%></td>
                    <td><%=q.getHotel().getLogradouro()%></td>
                    <td><%=q.getQuartoTipo().getNomeQuartoTipo()%></td>
                    <td><%=q.getQuartoTipo().getNumCapacidadeMaxima()%></td>
                    <td><input type="radio" name="quartoSelecionado" value=<%=q.getId()%> ></td>
                </tr>
                <%
                    }
                %>
            </table>

            <p><input type="submit" name="Enviar"></p>
        </form>
    </body>
</html>
