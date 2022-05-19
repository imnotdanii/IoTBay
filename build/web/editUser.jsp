<%-- 
    Document   : editUser
    Created on : 18 May 2022, 4:10:28 pm
    Author     : cdanielle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.*"%>
<%@page import="controller.*"%>

<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: Edit Profile</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="editUser.css">
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
                <!-- need to change back to jsp -->
                <a href="logout.jsp"><button>Log Out</button></a>
                <a href="manageProfile.jsp"><button>Manage My Profile</button></a>
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
                    <li><a href="manageProfile.html#order-history" class="account-link">Order History</a></li>
                    <li><a href="manageProfile.html#request-access-logs" class="account-link">Request Access Logs</a></li>
                    <li><a href="manageProfile.html#contact-us" class="account-link">Contact Us</a></li>
                </ul>
            </nav>
        </div>

        <div id="content">
            <body>
                <main id="main-doc">
                    <section class="main-section"id="personal-information">
                        <header>Personal Information</header>
                            <%
                                User user = (User) session.getAttribute("user");
                            %>
                        <form action="<%=request.getContextPath()%>/EditServlet"  method="post" id="register-form">
                            <label for="name">Full Name:</label><br>
                            <input type="text" id="name" name="name" placeholder="${user.getName()}" required="true"><br>
                            <label for="phone">Phone number:</label><br>
                            <input type="text" id="phone number" name="phone-number" placeholder="${user.getPhone()}" required="true"><br>
                            <label for="address">Address:</label><br>
                            <input type="text" id="address" name="address" placeholder="${user.getAddress()}" required="true"><br>
                            <label for="dob">Date of birth:</label><br>
                            <input type="date" id="dob" name="dob" placeholder="${user.getDob()}." required="true"><br>
                            <label for="email">Email:</label><br>
                            <input type="text" id="email" name="email" placeholder="${user.getEmail()}" required="true"><br>
                            <label for="password">Password:</label><br>
                            <input type="password" id="password" name="password" placeholder="Enter new password..." required="true"><br>
                            <label for="password">Confirm your password:</label><br>
                            <input type="password" placeholder="Confirm new password..."><br>
                            <input id="submit" type="submit" value="Update">
                        </form>
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