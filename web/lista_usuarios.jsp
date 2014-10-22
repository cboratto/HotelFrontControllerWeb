<%-- 
    Document   : lista_usuarios
    Created on : Oct 22, 2014, 9:20:35 PM
    Author     : caioboratto
--%>

<%@page import="hotelaria.modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Usuarios</title>
    </head>
    <h1>Lista de usuários:</h1>

    <table border="1">
        <tr><th>id</th><th>Nome</th></tr>
                <%
                    List<Usuario> usuarios = (List<Usuario>) request.getAttribute("lista_usuarios");
                    if (usuarios != null) {
                        for (Usuario u : usuarios) {
                %>

        <tr>
            <td><%=u.getId()%></td>
            <td><%=u.getNome()%></td>
        </tr>
        <%
                }
            }
        %>
    </table>

    <p><a href="/HotelFrontControllerWeb31328334/index.jsp">Voltar à página inicial</a></p>
</html>
