<%-- 
    Document   : lista_quartos
    Created on : Oct 24, 2014, 8:31:36 PM
    Author     : caioboratto
--%>

<%@page import="hotelaria.modelo.Quarto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Quartos:</h1>

        <table border="1">
            <tr><th>id</th><th>Nome do Hotel</th><th>Tipo do Quarto</th></tr>
                    <%
                        List<Quarto> quartos = (List<Quarto>) request.getAttribute("lista_quartos");
                        if (quartos != null) {
                            for (Quarto u : quartos) {
                    %>

            <tr>
                <td><%=u.getId()%></td>
                <td><%=u.getHotel().getNome()%></td>
                <td><%=u.getQuartoTipo().getNomeQuartoTipo()%></td>
                
            </tr>
            <%
                    }
                }
            %>
        </table>

    </body>
</html>
