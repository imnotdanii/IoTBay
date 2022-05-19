<%-- 
    Assignment Drafting.
    Version: 0.

    Document   : confirmOrderPage
    Created on : 16/05/2022, 11:48:08 AM
    Author     : dylanstyman
--%>

<%--
This page acts as the third point in the "CREATE ORDER" process.
It is triggered by selecting either the NEXT button (from Order Form Page), or resuming an order at this stage [1]. 
This page is used to summarise and confirm the products, price, shipping, payment and contact info details before confirming the order.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="orderStyle.css">
        <title>Confirm Order Page</title>
    </head>
    
    <body>
        
        <%--
        Insert site header/menu/banner here.
        --%>
        <h1>Header/Menu/Banner Section</h1> <br>
        
        <p>Please check your order details below before confirming.</p>
        
        <%--
        DYNAMIC SECTION:
        Request: get cart items (from order object). Display item summaries (name, price), and calc. total price (or this done in order model?)
        (incl. discount code?) -> maybe leave this feature out, but note where to be included (WIP, pending).
        --%>
        <h1>Product Summary Section (Dynamic)</h1> <br>
        
        <%--
        DYNAMIC SECTION:
        Request: is signed in? If not, retrieve fields from previous page.
            -> if so, request relevant info from user account and display. 
               if so, also display "is correct? change?" button that saves order and redirects to edit acc. deets.)
        --%>
        <h1>Contact Summary Section (Dynamic)</h1> <br>
        
        <%--
        DYNAMIC SECTION:
        Request: is signed in? If not, retrieve fields from previous page.
            -> if so, request relevant info from user account and display. 
               if so, also display "is correct? change?" button that saves order and redirects to edit acc. deets.)
        --%>
        <h1>Address Summary Section (Dynamic)</h1> <br>
        
        <%--
        DYNAMIC SECTION:
        Request: is signed in? If not, retrieve fields from previous page.
            -> if so, request relevant info from user account and display. 
               if so, also display "is correct? change?" button that saves order and redirects to edit acc. deets.)
        --%>
        <h1>Payment Summary Section (Dynamic)</h1> <br>
        
        <%--
        Save, Next buttons. (not dynamic this time. should be present regardless).
            -> SAVE, writes changes to DB, stops editing enabled, update progress, etc. redirect to order outcome page ("saved").
            -> NEXT, 
                -> check if details are valid (see Key Features 4). if not, error. 
                -> writes changes to DB, redirect to PROCESSING or ORDER OUTCOME PAGE.
        --%>
        <h1>Save & Next Buttons Section</h1> <br>
        
    </body>
    
</html>
