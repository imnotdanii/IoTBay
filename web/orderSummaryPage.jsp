<%-- 
    Assignment Drafting.
    Version: 3

    Document   : orderSummaryPage
    Created on : 16/05/2022, 11:06:35 AM
    Author     : dylanstyman
--%>

<%--
This page acts as the first point in the "CREATE ORDER" process.
It is triggered by selecting either the CART ICON button (from header), or resuming an order at this stage (orderProgress[0]). 
This page is used to summarise and confirm the products and cost of order, as well as entering contact/address info before proceeding to the payment screens.
The page should assess whether a user is signed in (if so, retrieve their exisitng info), or not (if so, provide fields).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.*"%>
<%@page import="controller.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="orderStyle.css">
        <title>IoTBay: Order Form Page</title>
    </head>
    
    <body>
        
        <header>
            <div id="top-bar">
                <a href="index.jsp"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
            </div>
        </header>
        
        <h1>Products in Order:</h1> <br>
        <p>[Display Products in Cart]</p><br>
        <%--
        DYNAMIC SECTION:
        Request: get cart items (from order object). Display item summaries (name, price), and calc. total price (or this done in order model?)
        (how to incorporate discount code section?)
        --%>
        <% 
            //Get list of products in Cart, (request?) NEED CART OBJECT?
            //for loop through products and for each, jsp html to display.
            //${user.getOrders()} --?
        %>
        
        <h1>Contact & Address Information:</h1> <br>
        <%-- <p>(Display Customer info OR provide fields to be filled (form))</p><br> --%>
        <%--
        DYNAMIC SECTION:
        Request: is signed in? If not, display fields to be written into. -> check not null, then pass the input to next page
            -> if so, request relevant contact info from user account and display. 
               if so, also display "is correct? change?" button that saves order and redirects to edit acc. deets.)
        --%>
        
        <%
            User user = (User) session.getAttribute("user");
                if (user == null) {
        %>
                <%-- if user not logged in, provide fields --%>
                
                <p>Please provide your details to complete your order.</p><br>
                <br>
                <div id="customerDetailsDiv">
                    <form action="<%=request.getContextPath()%>/SaveOrderServlet"  method="post">
                        <div id="custDeetsSubDivContact">
                            <label for="name">Name:</label>
                            <input type="text" id="name" name="name" placeholder="Enter your full name..." required="true"><br>
                            <label for="email">Email:</label>
                            <input type="text" id="email" name="email" placeholder="Enter your email..." required="true"><br>
                            <label for="phone">Phone number:</label>
                            <input type="text" id="phone-number" name="phone-number" placeholder="Enter your phone number..." required="true"><br>
                        </div><br>
                        <div id="custDeetsSubDivAddress">
                            <label for="address">Address:</label>
                            <input type="text" id="address" name="address" placeholder="Enter your full address..." required="true"><br>
                            <label type="text">Accept Terms of Service:</label>
                            <input type="checkbox" id="tos" name="tos" required="true"><br>
                        </div><br>
                        <br>
                        <%-- Replace button1 with <p>Log in or create an account to save an order.</p> ? Or unclickable greyed button 1? (hover-over help?)--%>
                        <input type="submit" name="button1" value="Save Order" >
                        <input type="submit" name="button2" value="Proceed To Payment" >
                        <input type="submit" name="button3" value="Cancel Order" >
                        <%-- use above submit rather than below buttons? delegate behaviour based on value
                            <button>Save Order</button><button>Proceed to Payment</button><button>Cancel Order</button>
                        --%>
                    </form>
                </div>
                <br>
                <div id="login-button-Div">
                    <p id="smallFont">(Or if you already have an account, Sign in here:)</p><br>
                    <a href="login.jsp"><button>Sign In</button></a><br>
                </div>

        <% 
            } else {
        %>
                <%-- if user logged in, retrieve fields and display. --%>
                
                <p>Please check that your information is correct</p><br>
                <p>Name: </p><p>${user.getName()}</p>
                <p>Email: </p><p>${user.getEmail()}</p>
                <p>Date of Birth: </p><p>${user.getDOB()}</p>
                <p>Phone Number: </p><p>${user.getPhone()}</p><br>
                <p>Address: </p><p>${user.getAddress()}</p><br>
                <br>
                <label type="text">Accept Terms of Service:</label>
                            <input type="checkbox" id="tos" name="tos" required="true"><br>
                <a href="logout.jsp"><button>Log Out</button></a>
                
                <form action="<%=request.getContextPath()%>/ManageProfileServlet" method="post">
                    <%-- is there a way other than "input" to retrieve the data? --%>
                    <button>Change Details</button><br>
                </form>
                <form>
                    <%-- edit this to make sure it captures and sends info appropriately.--%>
                    <br>
                        <input type="submit" name="button1" value="Save Order" >
                        <input type="submit" name="button2" value="Proceed To Payment" >
                        <input type="submit" name="button3" value="Cancel Order" >
                    <%--
                        <button>Save Order</button><button>Proceed to Payment</button><button>Cancel Order</button>
                    --%>
                </form>
        <%
            }
        %>
        
        <%--
        Save, Next buttons. (not dynamic this time. should be present regardless).
            -> SAVE, writes changes to DB, stops editing enabled, update progress, etc. redirect to order outcome page ("saved").
            -> NEXT, 
                -> check if details are valid (see Key Features 4). if not, error. 
                -> writes changes to DB, redirect to CONFIRM ORDER PAGE.
        --%>
        <div id="orderButtonsDiv">
            <%--
            Create another button for "save cart"? Redirects to home page?
            <a href="index.jsp"><button>Save Cart</button></a>
            --%>
            <%--
            <form action="<%=request.getContextPath()%>/SaveOrderServlet" method="post">
                <button>Proceed to Payment</button>
            </form>
            <form action="<%=request.getContextPath()%>/SaveOrderServlet" method="post">
                <button>Save Order</button>
            </form>
            <form action="<%=request.getContextPath()%>/SaveOrderServlet" method="post">
                <button>Cancel Order</button>
            </form>
            --%>
            
        </div>
        
        <footer>
            <p>&copy; Group 8</p>
            <p>Introduction to Software Development 2022</p>
            <p>University of Technology, Sydney</p>
        </footer>
        
    </body>
    
</html>
