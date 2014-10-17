<%@page import="java.util.List"%>
<%@page import="hotelaria.modelo.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de hotéis</title>
    </head>
    <body>
        <h1>Lista de hotéis:</h1>
        
        <table border="1">
            <tr><th>id</th><th>Nome</th><th>Logradouro</th><th>Número</th></tr>
            <%
                List<Hotel> hoteis = (List<Hotel>) request.getAttribute("lista_hoteis");
                if (hoteis != null) {
                    for (Hotel h : hoteis) { 
            %>
            
            <tr>
                <td><%=h.getId()%></td>
                <td><%=h.getNome()%></td>
                <td><%=h.getLogradouro()%></td>
                <td><%=h.getNumero()%></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
        
        <p><a href="/HotelFrontControllerWeb31328334/index.jsp">Voltar à página inicial</a></p>
    </body>
</html>
