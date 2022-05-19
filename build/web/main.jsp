<%-- 
    Document   : main
    Created on : 3 Apr 2022, 9:16:07 pm
    Author     : cdanielle
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IoTBay</title>
    </head>
    <body>
        <%
            User user = (User) session.getAttribute("user");
        %>
        <h1>Welcome, <%=user.getName()%></h1>

        <form action="<%=request.getContextPath()%>/LogoutServlet"  method="get" id="logout-form">
            <input id="submit" type="submit" value="Log out">
        </form>
        <p>WIP</p>
    </body>
</html>
