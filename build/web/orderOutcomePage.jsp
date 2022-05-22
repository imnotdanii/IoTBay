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
        <link type="text/css" rel="stylesheet" href="orderStylev2.css">
        <title>IoTBay: Order Outcome Page</title>
    </head>
    
    <body>
        
        <header>
            <div id="top-bar">
                <a href="index.html"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
            </div>
        </header>
    
        <%--
        DYNAMIC SECTION:
        Request: outcome result from previous page
        --%>
        <div id="allDone">
            <br>
            <h2>All done!</h2>
            <br>
            <p id="p1"> ${message} </p1>
            <br>
        </div> <br>
        
        <footer>
            <p>&copy; Group 8</p>
            <p>Introduction to Software Development 2022</p>
            <p>University of Technology, Sydney</p>
        </footer>
        
    </body>
    
</html>
