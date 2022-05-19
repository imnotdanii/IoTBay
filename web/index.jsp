<%-- 
    Document   : index
    Created on : 14 May 2022, 12:28:30 pm
    Author     : cdanielle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.*"%>
<%@page import="controller.*"%>

<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: Buy IoT Devices</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="indexStyle.css">
        <script src="https://kit.fontawesome.com/5b9a15581a.js" crossorigin="anonymous"></script>
    </head>

    <body onload="startTime()">
        <header>
            <div id="search-area-container">
                <a href="index.html"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
                <div class="search-form-container">
                    <form>
                        <input type="text" placeholder="What are you looking for?" name="search-bar" id="search-bar">
                        <button type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                    </form>
                </div>
                <div id="top-buttons"> 
                    <!-- need to change back to jsp -->
                    <%
                        User user = (User) session.getAttribute("user");

                        if (user == null) {
                    %>
                    <a href="login.jsp"><button>Sign In</button></a>
                    <a href="register.jsp"><button>Register</button></a>

                    <% } else {
                    %>
                    <p>${user.getName()}</p>
                    <a href="logout.jsp"><button>Log Out</button></a>
                    <form action="<%=request.getContextPath()%>/ManageProfileServlet" method="post">
                        <button>Manage My Profile</button>
                    </form>
                    <%}%>
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

        <main>
            <div id="slideshow-container">
                <div class="img-container slideshow-animation"><img src="placeholder.jpg" alt=""></div>
                <div class="img-container slideshow-animation"><img src="placeholder.jpg" alt=""></div>
                <div class="img-container slideshow-animation"><img src="placeholder.jpg" alt=""></div>
            </div>

            <div id="products-container"> 
                <div class="products-row">
                    <div class="products-column">
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                    </div>
                    <div class="products-column">
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                    </div>
                    <div class="products-column">
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                        <a href=""><img src="placeholder.jpg" alt=""></a> 
                    </div>
                </div>

        </main>

        <footer>
            <p>&copy; Group 8</p>
            <p>Introduction to Software Development 2022</p>
            <p>University of Technology, Sydney</p>
        </footer>
        <script type="text/javascript" src="index.js"></script>
        <jsp:include page="/ConnServlet" flush="true"/>
        <jsp:include page="/ManageProfileServlet" flush="true"/>

    </body>
</html>