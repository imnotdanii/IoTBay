<%-- 
    Document   : payment
    Created on : 18/04/2022, 8:48:27 PM
    Author     : dan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: Payment</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="PaymentStyle.css">
        <!--<script src="https://kit.fontawesome.com/5b9a15581a.js" crossorigin="anonymous"></script>-->
    </head>
    <body>
        <header>
        <div id="top-bar">
           <a href="index.jsp"><img src="iotbaylogo.png" alt="" id="logo"></a>
        </div>
    </header>
        <main>
        <div id="middle-div">
            <h1>Please enter your payment details</h1>
            <h3>Or <a href="register.jsp">back to order</a></h3>
        <!--<form action="ready.jsp" method="POST" id="payment-form">-->
            <h2><label for="payment-method">Choose a payment method:</label>
            <select id="payment-method" name="payment-method">
                <option value="visacard">VISA Card</option>
                <option value="mastercard">MasterCard</option>
                <option value="paypal">PayPal</option>
                <option value="applepay">Apple Pay</option>
                <option value="giftcard">Gift Card</option>    
            </select>
            </h2>
            
            <form>
                <label for="name">Card Owner Name:</label><br>
                <input type="text" id="COname" name="COname" placeholder="Enter your card owner name..." required="true"><br>
                <label for="CNumber">Card Number:</label><br>
                <input type="text" id="CNumber" name="CNumber" placeholder="Enter your card number..." required="true"><br>
                <label for="EDate">Expiry Date:</label><br>
                <input type="text" id="EDate" name="EDate" placeholder="Enter your card expiry date..." required="true"><br>
                <label for="cvv">CVV Code:</label><br>
                <input type="password" id="cvv" name="cvv" placeholder="Enter your cvv code..." required="true"><br>
                <button type="submit" id="payment-button" value="sumbit">Pay</button>
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
