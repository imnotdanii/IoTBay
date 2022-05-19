<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="loginStyle.css">
        <script src="https://kit.fontawesome.com/5b9a15581a.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <div id="top-bar">
                <a href="index.jsp"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
            </div>
        </header>

        <%
            String existErr = (String) session.getAttribute("existErr");
            String emailErr = (String) session.getAttribute("emailErr");
            String passErr = (String) session.getAttribute("passErr");
        %>

        <main>
            <div id="middle-div">
                <h1>Sign in to IoTBay</h1>
                <h3>Or <a href="register.jsp">create an account</a></h3>
                <span class="message"> <%=(existErr != null ? existErr : "")%></span>
                <form action="<%=request.getContextPath()%>/LoginServlet" method="POST">
                    <input class="" type="email" name="email" placeholder ="Enter your email address..." required><br>
                    <input class="" type="password" name="password" placeholder ="Enter your password..." required><br>
                    <button type="submit" id="login-button">Login</button>
                </form>
            </div>
        </main>

        <footer>
            <p>&copy; Group 8</p>
            <p>Introduction to Software Development 2022</p>
            <p>University of Technology, Sydney</p>
        </footer>

    </body>
</html>
