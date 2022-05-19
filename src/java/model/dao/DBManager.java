package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.*;

/**
 *
 * @authors Danielle, Dylan and Dan
 */
public class DBManager {

    private Statement statement;

    public DBManager(Connection conn) throws SQLException {
        statement = conn.createStatement();
    }

//Find user by email and password in the database   
    //NAME, ADDRESS, PHONE, DOB, EMAIL, PASSWORD
    public User findUser(String email, String password) throws SQLException {
        String s = "SELECT * FROM IOTADMIN.Users where EMAIL = '" + email + "'and PASSWORD='" + password + "'";
        ResultSet rs = statement.executeQuery(s);
        while (rs.next()) {
            System.out.println("looking for user");
            String userEmail = rs.getString(6);
            String userPass = rs.getString(7);
            if (userEmail.equals(email) && userPass.equals(password)) {
                String userName = rs.getString(2);
                String userDOB = rs.getString(5);
                String userPhone = rs.getString(4);
                String userAddr = rs.getString(3);
                return new User(userName, userAddr, userPhone, userDOB, userEmail, userPass);
            }
        }
        return null;
    }

//Add a user-data into the database   
    public void addUser(String name, String address, String phone, String dob, String email, String password) throws SQLException {                   //code for add-operation       
        statement.executeUpdate("INSERT INTO iotadmin.Users (NAME, ADDRESS, PHONE, DOB, EMAIL, PASSWORD)" + "VALUES('" + name + "', '" + address + "', '" + phone + "', '" + dob + "', '" + email + "', '" + password + "')");
    } //need to connect this method to the register.jsp

//update a user details in the database   
    public void updateUser(String name, String address, String phone, String dob, String email, String password) throws SQLException {
        statement.executeUpdate("UPDATE iotadmin.Users SET NAME='" + name + "', ADDRESS='" + address + "', PHONE='" + phone + "', DOB='" + dob + "', EMAIL='" + email + "', PASSWORD='" + password + "' WHERE EMAIL ='" + email + "'");
    }

//delete a user from the database   
    public void deleteUser(String email) throws SQLException {
        statement.executeUpdate("DELETE FROM iotadmin.Users WHERE EMAIL='" + email + "'");
    }

    //Add an order to the database:
    //orderID, accountID, orderProgress, orderCancelled, orderConfirmed, editingEnabled, dateCreated, dateSubmitted, totalOrderPrice
    public void addOrder(int orderID, int accountID, int orderProgress, boolean orderCancelled, boolean orderConfirmed, boolean editingEnabled, String dateCreated, String dateSubmitted, double totalOrderPrice) throws SQLException {
        statement.executeUpdate("INSERT INTO iotadmin.OrdersTable " + "VALUES(' " + orderID + " ', ' " + accountID + " ', ' " + orderProgress + " ', ' " + orderCancelled + " ', ' " + orderConfirmed + " ', ' " + editingEnabled + " ', ' " + dateCreated + " ', ' " + dateSubmitted + " ', ' " + totalOrderPrice + " ')");
    }

//update an existing order in the database:  
    //also used for cancel order (rather than delete) as record needs to stay in system.
    public void updateOrder(int orderID, int accountID, int orderProgress, boolean orderCancelled, boolean orderConfirmed, boolean editingEnabled, String dateCreated, String dateSubmitted, double totalOrderPrice) throws SQLException {
        statement.executeUpdate("UPDATE iotadmin.OrdersTable SET ORDERID= ' " + orderID + " ', ACCOUNTID= ' " + accountID + " ', ORDERPROGRESS= ' " + orderProgress + " ', ORDERCANCELLED= ' " + orderCancelled + " ', ORDERCONFIRMED= ' " + orderConfirmed + " ', EDITINGENABLED= ' " + editingEnabled + " ', DATECREATED= ' " + dateCreated + " ', DATESUBMITTED= ' " + dateSubmitted + " ', TOTALORDERPRICE= ' " + totalOrderPrice + " ' ");
    }

//delete an order from the database:
    public void deleteOrder(int orderID) throws SQLException {
        statement.executeUpdate("DELETE FROM iotadmin.OrdersTable WHERE ORDERID= '" + orderID + "'");
    }

//Fetch Orders (for use when customers need to check their list of saved orders?)    
    public ArrayList<Order> fetchOrders() throws SQLException {
        String fetch = "SELECT * FROM iotadmin.OrdersTable";
        ResultSet rs = statement.executeQuery(fetch);
        ArrayList<Order> temp = new ArrayList();

        while (rs.next()) {
            int orderID = rs.getInt(1);
            int accountID = rs.getInt(2);
            int orderProgress = rs.getInt(3);
            boolean orderCancelled = rs.getBoolean(4);
            boolean orderConfirmed = rs.getBoolean(5);
            boolean ordereditingEnabled = rs.getBoolean(6);
            String dateCreated = rs.getString(7);
            String dateSubmitted = rs.getString(7);
            double totalOrderPrice = rs.getDouble(8);
        }
        return temp;
    }

    public void addPayment(String name, String cardNumber, String expiryDate, String cvv, String userEmail) throws SQLException {
        statement.executeUpdate("INSERT INTO iotadmin.Cardinfo (NAME, CARDNUMBER, EXPIRYDATE, CVV, USEREMAIL)" + "VALUES('" + name + "', '" + cardNumber + "', '" + expiryDate + "', '" + cvv + "', '" + userEmail + "')");
    }

    public void updatePayment(String name, String cardNumber, String expiryDate, String cvv, String userEmail) throws SQLException {
        statement.executeUpdate("UPDATE iotadmin.Cardinfo (NAME, CARDNUMBER, EXPIRYDATE, CVV, USEREMAIL)" + "VALUES('" + name + "', '" + cardNumber + "', '" + expiryDate + "', '" + cvv + "', '" + userEmail + "')");
    }

    public void deletePayment(String name, String cardNumber, String expiryDate, String cvv, String userEmail) throws SQLException {
        statement.executeUpdate("DELETE iotadmin.Cardinfo (NAME, CARDNUMBER, EXPIRYDATE, CVV, USEREMAIL)" + "VALUES('" + name + "', '" + cardNumber + "', '" + expiryDate + "', '" + cvv + "', '" + userEmail + "')");
    }
    
}
