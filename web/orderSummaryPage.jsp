<%-- 
    Assignment Drafting.
    Version: 0.

    Document   : orderSummaryPage
    Created on : 16/05/2022, 11:06:35 AM
    Author     : dylanstyman
--%>

<%--
This page acts as the second point in the "CREATE ORDER" process.
It is triggered by selecting either the CREATE ORDER button (from Cart Summary Page), or resuming an order at this stage [0]. 
This page is used to summarise and confirm the products and cost of order, as well as entering payment/shipping info before proceeding to the order form.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="orderStyle.css">
        <title>IoTBay: Order Form Page</title>
    </head>
    
    <body>
        
        <%--
        NOTE: THIS PAGE SHOULD MERGE order summary and order form page components. do it all here.
        --%>
        
        <%--
        Insert site header/menu/banner here.
        --%>
        <h1>Header/Menu/Banner Section</h1> <br>
        
        <%--
        DYNAMIC SECTION:
        Request: get cart items (from order object). Display item summaries (name, price), and calc. total price (or this done in order model?)
        (how to incorporate discount code section?)
        --%>
        <h1>Product Summary Section (Dynamic)</h1> <br>
        
        <%--
        DYNAMIC SECTION:
        Request: is signed in? If not, display fields to be written into. -> check not null, then pass the input to next page
            -> if so, request relevant contact info from user account and display. 
               if so, also display "is correct? change?" button that saves order and redirects to edit acc. deets.)
        --%>
        <h1>Contact Information Section (Dynamic)</h1> <br>
        
        <%--
        DYNAMIC SECTION:
        Request: is signed in? If not, display fields to be written into. -> check not null, then pass the input to next page
            -> if so, request relevant address info from user account and display. 
               if so, also display "is correct? change?" button that saves order and redirects to edit acc. deets.)
        --%>
        <h1>Address Information Section (Dynamic)</h1> <br>
        
        <%--
        DYNAMIC SECTION:
        Request: is signed in? If not, display fields to be written into. -> check not null, then pass the input to next page
            -> if so, request relevant address info from user account and display. 
               if so, also display "is correct? change?" button that saves order and redirects to edit acc. deets.)
        --%>
        <h1>Payment Details Section (Dynamic)</h1> <br>
        
        <%--
        Save, Next buttons. (not dynamic this time. should be present regardless).
            -> SAVE, writes changes to DB, stops editing enabled, update progress, etc. redirect to order outcome page ("saved").
            -> NEXT, 
                -> check if details are valid (see Key Features 4). if not, error. 
                -> writes changes to DB, redirect to CONFIRM ORDER PAGE.
        --%>
        <h1>Save & Next Buttons Section</h1> <br>
        
    </body>
    
</html>
