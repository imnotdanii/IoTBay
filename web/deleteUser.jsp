<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: Delete User</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="loginStyle.css">
        <script src="https://kit.fontawesome.com/5b9a15581a.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <div id="top-bar">
                <a href="index.html"><img src="images/iotbaylogo.png" alt="" id="logo"></a>
            </div>
        </header>

        <main>
            <div id="middle-div">
                <h1>Delete My Account</h1>
                <form action="<%=request.getContextPath()%>/DeleteServlet" method="POST">
                    <label for="email" id="email-label" >Email:</label><br>
                    <input class="" type="email" name="email" placeholder ="Enter your email address..." required><br>

                    <label for="password" id="password-label">Password:</label><br>
                    <input class="" type="password" name="password" placeholder ="Enter your password..." required><br>

                    <button type="submit" id="login-button">Delete</button>
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
