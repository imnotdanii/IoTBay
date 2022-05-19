<%-- 
    Assignment Drafting.
    Version: 0.

    Document   : orderOutcomePage
    Created on : 16/05/2022, 12:17:22 PM
    Author     : dylanstyman
--%>

<%--
This page acts as the final point in the "CREATE ORDER" process, as well as the "SAVE ORDER" process.
It is triggered by selecting either the SAVE buttom (from preceeding pages) or CONFIRM button (from confirm page). 
This page is used to display the outcome of the SAVE or ORDER actions (display status of order and where to find next).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="orderStyle.css">
        <title>IoTBay: Order Outcome Page</title>
    </head>
    
    <body>
        
        <%--
        Insert site header/menu/banner here.
        --%>
        <h1>Header/Menu/Banner Section</h1> <br>
    
        <%--
        DYNAMIC SECTION:
        Request: outcome result from previous page
        --%>
        <h1>Outcome Section (Dynamic)</h1> <br>
        
    </body>
    
</html>
