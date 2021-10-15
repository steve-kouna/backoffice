<%-- 
    Document   : home
    Created on : Oct 12, 2021, 4:42:02 PM
    Author     : Steve KOUNA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OnlineStore – Gestion de la boutique</title>
    </head>
    <body>
        <h1>OnlineStore – Gestion de la boutique</h1>
        <c:if test="${not empty username}">
        <span>Bonjour <%= session.getAttribute("username") %> (<a href='logout'>Deconnexion</a>) </span>
        <div><a href='./catalogue'>Accès au catalogue des oeuvres</a></div>
        </c:if>
    </body>
</html>
