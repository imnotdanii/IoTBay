<%-- 
    Document   : manageProfile
    Created on : 17 May 2022, 5:24:23 pm
    Author     : cdanielle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.*"%>
<%@page import="controller.*"%>

<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: User Profile</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="manageProfile.css">
        <script src="https://kit.fontawesome.com/5b9a15581a.js" crossorigin="anonymous"></script>

    </head>
    <header>
        <div id="search-area-container">
            <a href="index.jsp"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
            <div class="search-form-container">
                <form>
                    <input type="text" placeholder="What are you looking for?" name="search-bar" id="search-bar">
                    <button type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                </form>
            </div>
            <div id="top-buttons"> 
                <%
                    User user = (User) session.getAttribute("user");
                %>
                <!-- need to change back to jsp -->
                <p>${user.getName()}</p>
                <a href="logout.jsp"><button>Log Out</button></a>
                <form action="<%=request.getContextPath()%>/ManageProfileServlet" method="post">
                    <button>Manage My Profile</button>
                </form>
                <a href=""><i class="fa-solid fa-cart-shopping"></i></a>
            </div>
        </div>

        <div id="nav-container">
            <nav>
                <ul>
                    <li><a href="index.html" class="nav-link">Home</a></li>
                    <li><a href=""class="nav-link" >Smart Home Devices</a></li>
                    <li><a href="" class="nav-link">Industrial Sensors</a></li>
                    <li><a href=""class="nav-link">Industrial Robots</a></li>
                    <li><a href=""class="nav-link">Healthcare Devices</a></li>
                    <li><a href=""class="nav-link">Wiring</a></li>
                    <li><a href=""class="nav-link">Modems and Routers</a></li>
                </ul>
            </nav>
        </div>
    </header>

    <div id="grid-container">
        <div id="navigation">
            <nav id="navbar">
                <header><h1 id="title">Account Settings</h1></header>
                <ul id="account-list">
                    <li><a href="#personal-information" class="account-link">Personal Information</a></li>
                    <li><a href="#order-history" class="account-link">Order History</a></li>
                    <li><a href="#payment-details" class="account-link">Payment Details</a></li>
                    <li><a href="#request-access-logs" class="account-link">Request Access Logs</a></li>
                    <li><a href="#contact-us" class="account-link">Contact Us</a></li>
                </ul>
            </nav>
        </div>

        <div id="content">
            <body>
                <main id="main-doc">
                    <section class="main-section"id="personal-information">
                        <header>Personal Information    <a href="editUser.jsp">edit</a>
                            </header>
                        <ul>
                            <h3>Full name: </h3> 
                            <p>${user.getName()}</p>
                            <h3>Current Address: </h3>
                            <p>${user.getAddress()}</p>
                            <h3>Date Of Birth: </h3>
                            <p>${user.getDob()}</p>
                            <h3>Phone Number: </h3>
                            <p>${user.getPhone()}</p>
                            <h3>Email: </h3>
                            <p>${user.getEmail()}</p>
                            <h3>Password: </h3>
                            <p>******</p>
                        </ul>
                    </section>
                    <section class="main-section" id="order-history">
                        <header>Your Order History</header>
                        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quaerat, minus:</p>
                        <ul>
                            <li>Lorem ipsum dolor sit.</li>
                            <li>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Corrupti.</li>
                            <li>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Fugit, natus.</li>
                        </ul>
                    </section>
                        
                    <section class="main-section"id="payment-details">
                        <header>Payment Details    <a href="editPayment.jsp">edit</a>
                            </header>
                        <ul>
                            <h3>Card Owner Name: </h3> 
                            <p>${payment.getCOName()}</p>
                            <h3>Expiry Date: </h3>
                            <p>${payment.getExpiryDate()}</p>
                            <h3>CVV Code: </h3>
                            <p>***</p>
                        </ul>
                    </section>

                    <section class="main-section" id="request-access-logs">
                        <header>Request Access Logs</header>
                        <p>If you would like to view your access logs, <a href="">click here to send an eRequest.</a></p>

                    </section>
                    <section class="main-section" id="contact-us">
                        <header>Contact Us</header>
                        <p>If you have any issues with our products, please don't hesitate to contact us through our enquiry form. Please allow 24-48 hours for a customer service agent to respond.</p>
                    </section>

                    <section class="e-section" id="delete-account">
                        <header>Delete Account</header>
                        <p>If you wish to delete your account, <a href="deleteUser.jsp">click here</a>. You will not be able to retrieve your account.</p>
                    </section>
                </main>
            </body>
        </div>
    </div>

    <footer>
        <p>&copy; Group 8</p>
        <p>Introduction to Software Development 2022</p>
        <p>University of Technology, Sydney</p>
    </footer>
</html>