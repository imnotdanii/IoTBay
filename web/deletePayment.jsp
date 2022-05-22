<<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: Delete Payment</title>
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

        <main>
            <div id="middle-div">
                <h1>Delete My Payment Details</h1>
                <form action="<%=request.getContextPath()%>/DeletePaymentServlet" method="POST">
                    <label for="CNumber" id="email-label" >Card Number:</label><br>
                    <input class="" type="CNumber" name="CNumber" placeholder ="Enter your card number..." required><br>

                    <label for="cvv" id="password-label">CVV Code:</label><br>
                    <input class="" type="cvv" name="cvv" placeholder ="Enter your cvv code..." required><br>

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
