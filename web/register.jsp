<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: Register</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="registerStyle.css">
        <script src="https://kit.fontawesome.com/5b9a15581a.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <div id="top-bar">
                <a href="index.html"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
            </div>
        </header>

        <%
            String existErr = (String) session.getAttribute("existErr");
        %>

        <main>
            <div id="middle-div">
                <div id="form-headings">   
                    <h1>Register an account</h1>
                    <h3>Already a member? <a href="login.jsp">Sign in here.</a></h3>
                </div>

                <div id="form-container">
                    <span class="message"> <%=(existErr != null ? existErr : "")%></span>

                    <form action="<%=request.getContextPath()%>/RegisterServlet"  method="post" id="register-form">
                        <div id="top-form-container">
                            <div class="half-container" id="top-half">
                                <label for="name">Name:</label>
                                <input type="text" id="name" name="name" placeholder="Enter your full name..." required="true"><br>
                                <label for="phone">Phone number:</label>
                                <input type="text" id="phone-number" name="phone-number" placeholder="Enter your phone number..." required="true"><br>
                            </div>
                            <div class="half-container">
                                <label for="address">Address:</label>
                                <input type="text" id="address" name="address" placeholder="Enter your full address..." required="true"><br>
                                <label for="dob">Date of birth:</label>
                                <input type="text" id="dob" name="dob" placeholder="Enter your date of birth..." required="true"><br>
                            </div>

                        </div>
                        <div id="bottom-form-container">
                            <label for="email">Email:</label>
                            <input type="text" id="email" name="email" placeholder="Enter your email..." required="true"><br>
                            <label for="password">Password:</label>
                            <input type="password" id="password" name="password" placeholder="Enter your password..." required="true"><br>
                            <label for="password">Confirm your password:</label>
                            <input type="password" placeholder="Confirm your password..."><br>
                            <label type="text">Terms of Services</label>
                            <input type="checkbox" id="tos" name="tos" required="true"><br>
                            <input id="submit" type="submit" value="Sign Up">
                        </div>
                    </form>
                </div>

            </div>

        </main>
        <footer>
            <p>&copy; Group 8</p>
            <p>Introduction to Software Development 2022</p>
            <p>University of Technology, Sydney</p>
        </footer>

    </body>
</html>
