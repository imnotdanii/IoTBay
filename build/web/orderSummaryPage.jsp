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
        <link type="text/css" rel="stylesheet" href="orderStylev2.css">
        <title>IoTBay: Order Form Page</title>
    </head>
    
    <body>
        
        <header>
            <div id="top-bar">
                <a href="index.jsp"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
            </div>
        </header>
        
        <h2>Products in Order:</h2> <br>
        <%--
        DYNAMIC SECTION:
        Request: get cart items (from order object). Display item summaries (name, price), and calc. total price (or this done in order model?)
        (how to incorporate discount code section?)
        --%>
        <div id="productSummDiv1">
            <div id="productSummDiv2">
                <%-- <p id="p1">[Display Products in Cart]</p><br> --%>
        <% 
            User user = (User) session.getAttribute("user");
            int productIDInCart = 1;
            //Get list of products in Cart, (request?) NEED CART OBJECT?
            //for loop through products and for each, jsp html to display.
            //Hard to do without products/catalogue set up though.
        %>
        <%
            //ideally, recall from cart. But for this purpose, just use default?
            if (productIDInCart > 0) {
                //format product
                %>
                <br>
                <div class="row">
                    <div class="column">
                        <img src="images/R7000.png" alt="productImage" id="prodImg">
                    </div>
                    <div class="column">
                        <p id="prodText1">Item:</p><p id="prodText2">[Insert Item Name]<% %></p><br>
                        <p id="prodText1">Quantity:</p><p id="prodText2">[Insert Quantity]</p><br>
                        <p id="prodText1">Cost:</p><p id="prodText2">[Insert Cost]<% %></p><br>
                        <br>
                        <br>
                        <p id="prodText1">Total Cost:</p><p id="prodText2">[Insert Cost]<% %></p><br>
                    </div>
                </div>
                <br>
                <%
            } else {
                %>
                <br>
                <p id="noItems">No Items In Cart.</p><br>
                <p id="noItems">Head to the items page to add to cart.</p>
                <br>
                <%
            }
        %>
            </div>
        </div>
            <br>
        <h2>Contact & Address Information:</h2> <br>
        <%-- <p>(Display Customer info OR provide fields to be filled (form))</p><br> --%>
        <%--
        DYNAMIC SECTION:
        Request: is signed in? If not, display fields to be written into. -> check not null, then pass the input to next page
            -> if so, request relevant contact info from user account and display. 
               if so, also display "is correct? change?" button that saves order and redirects to edit acc. deets.)
        --%>
        
        <%
                if (user == null) {
        %>
                <%-- if user not logged in, provide fields --%>
                
                <p id="p1">Please provide your details to complete your order.</p><br>
                <br>
                <div id="deetsDiv1">
                    <form action="<%=request.getContextPath()%>/SaveOrderServlet"  method="post">
                        <div id="deetsDiv2">
                            <div id="deetsDiv3">
                                <label for="name">Name:</label>
                                <input type="text" id="name" name="name" placeholder="Enter your full name..." required="true"><br>
                                <label for="email">Email:</label>
                                <input type="text" id="email" name="email" placeholder="Enter your email..." required="true"><br>
                                <label for="phone">Phone number:</label>
                                <input type="text" id="phone-number" name="phone-number" placeholder="Enter your phone number..." required="true"><br>
                                <label for="address">Address:</label>
                                <input type="text" id="address" name="address" placeholder="Enter your full address..." required="true"><br>
                                <br>
                                <label type="text">Accept Terms of Service:</label>
                                <input type="checkbox" id="tos" name="tos" required="true"><br>
                            </div>
                        </div><br>
                        <br>
                        <div id="buttonDiv">
                        <%-- Replace button1 with <p>Log in or create an account to save an order.</p> ? Or unclickable greyed button 1? (hover-over help?)--%>
                        <%--
                        <input type="submit" name="button1" value="Save Order" >
                        --%>
                        <input type="submit" name="button2" value="Proceed To Payment" >
                        <input type="submit" name="button3" value="Cancel Order" >
                        <%-- use above submit rather than below buttons? delegate behaviour based on value
                            <button>Save Order</button><button>Proceed to Payment</button><button>Cancel Order</button>
                        --%>
                        </div>
                    </form>
                </div>
                <br>
                <br>
                <div id="buttonDiv">
                    <p id="smallFont">(Or if you already have an account, Sign in here:)</p><br>
                    <a href="login.jsp"><button>Sign In</button></a><br>
                </div>
                <br>

        <% 
            } else {
        %>
                <%-- if user logged in, retrieve fields and display. --%>
                
                <form action="<%=request.getContextPath()%>/SaveOrderServlet"  method="post">
                <p id="p2">Please confirm that your information is correct:</p><br>
                <p id="p2">Name: </p>
                <input type="hidden" id="name" name="name" value="${user.getName()}"/>
                <p id="p1">${user.getName()}</p>
                <p id="p2">Email: </p>
                <input type="hidden" id="name" name="email" value="${user.getEmail()}"/>
                <p id="p1">${user.getEmail()}</p>
                <p id="p2">Phone Number: </p>
                <input type="hidden" id="name" name="phone-number" value="${user.getPhone()}"/>
                <p id="p1">${user.getPhone()}</p><br>
                <p id="p2">Address: </p>
                <input type="hidden" id="name" name="address" value="${user.getAddress()}"/>
                <p id="p1">${user.getAddress()}</p><br>
                <br>
                <div id="buttonDiv">
                    <label type="text">Accept Terms of Service:</label><br>
                    <input type="checkbox" id="tos" name="tos" required="true"><br>
                </div>
                <br>
                <%-- <form action="<%=request.getContextPath()%>/ManageProfileServlet" method="post"> --%>
                    <%-- is there a way other than "input" to retrieve the data? --%>
                    <div id="buttonDiv">
                        <a href="manageProfile.jsp"><button>Change Details</button></a><br>
                    </div>
                <%-- </form> --%>
                <br>
                <br>
                
                    <%-- edit this to make sure it captures and sends info appropriately.--%>
                    <br>
                    <div id="buttonDiv">
                        <input type="submit" name="button1" value="Save Order" >
                        <input type="submit" name="button2" value="Proceed To Payment" >
                        <input type="submit" name="button3" value="Cancel Order" >
                    </div>
                    <%--
                        <button>Save Order</button><button>Proceed to Payment</button><button>Cancel Order</button>
                    --%>
                </form>
                <br>
                <br>
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
