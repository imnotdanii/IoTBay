<%-- 
    Assignment Drafting.
    Version: 0.

    Document   : cartSummaryPage
    Created on : 16/05/2022, 10:17:21 AM
    Author     : dylanstyman
--%>

<%--
This page acts as the first point in the "CREATE ORDER" process.
It is triggered by selecting either the CART, or the CREATE ORDER buttons 
(these should be accessible in the header/menu of most pages).
This page is used to summarise the current products in a cart, before proceeding to the order form.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="orderStyle.css">
        <title>IoTBay: Cart Summary Page</title>
    </head>
    
    <body>
        <header>
            <div id="top-bar">
                <a href="index.html"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
            </div>
        </header>
        
        <%--
        DYNAMIC SECTION:
        Request: check cart is empty. If empty, display "search items and add to cart first"
        Request: cart items. Display summaries in dynamic sections that summarise price, name pic. 
            -> add/remove items from user acc based on actions here. update to DB. update live (set up observer for this in controller?)
        --%>
        <h1>Cart Summary Section (Dynamic)</h1> <br>
        
        <div id="cartDiv">
            
            <%--move a lot of this into the model if possible?--%>
            
            <%
                //for FUTURE cart component?
                //get needed parameters
                //Need a WatchCartServlet?
                boolean cartEmpty = true; //request if cart is empty?
                boolean loggedIn = false; //request status of session?
                String cartMessage = ""; 
            %>
            
            <%
                if (cartEmpty)
                {
                    cartMessage = "It looks like your cart is empty! Head over to the products page to add a product to your cart.";
                }
                else
                {
                    cartMessage = "Please select 'Create Order' to continue!";
                }
            %>
            
            <p> <%= cartMessage %> </p> <br>
            
            <%-- 
                Create the base for the cart items.
                find a way to repeat this... For loop through items in cart?
            --%>
            
        </div>
        
        <%--
        DYNAMIC SECTION:
        Request: check cart is empty. If empty, leave blank.
        Request: is logged in? If not, don't display SAVE button:
        If items present, allow 2x buttons: SAVE ORDER and CREATE ORDER (hover descriptions for these)
            -> if save, create new order with product info and account info, order status, and write to DB (update order lists too)
                -> redirect to Order outcome page with input "saved".
            -> if next, create and write to DB (as with save option), then redirect to ORDER FORM PAGE.
        --%>
        <h1>Save/Create Order Buttons Section (Dynamic)</h1> <br>
        
        <div id="orderButtonsDiv">
            <%--
            Create another button for "save cart"? Redirects to home page?
            <a href="index.jsp"><button>Save Cart</button></a>
            --%>
            
            <form action="/CreateOrderServlet" method="post">
                <button>Create Order</button>
            </form>
            
        </div>
        
        <footer>
            <p>&copy; Group 8</p>
            <p>Introduction to Software Development 2022</p>
            <p>University of Technology, Sydney</p>
        </footer>
    </body>
    
</html>
