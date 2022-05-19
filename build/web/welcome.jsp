<%-- 
    Document   : welcome
    Created on : 3 Apr 2022, 8:42:39 pm
    Author     : cdanielle
--%>

<%@page import="model.User"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>IoTBay-Signed In</title>
    </head>
    <%
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String dob = request.getParameter("dob");
        String phone = request.getParameter("phone-number");
        String address = request.getParameter("address");
        %>
    
    <body>
        <h1>Welcome, <%= name%></h1>
        <p>Loading...</p>
        
        <%
            User user = new User(name, email, phone, address, password, dob);
            session.setAttribute("user", user);
            %>
    </body>
</html>

<script>
    setTimeout(function(){
        window.location.href = 'main.jsp';
    }, 3000);
</script>