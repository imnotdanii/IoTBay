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

    //Find userID based on User Email (for Order use):
    public int getUserID(String email) throws SQLException {
        int userID = 1;
        String fetch = "SELECT USERID FROM iotadmin.USERS WHERE EMAIL = '" + email + "'";        
        
        ResultSet rs = statement.executeQuery(fetch);

        if (rs.next()) {        
            userID = rs.getInt(1);      
        }
        return userID;
    }

    /*
    //Add an order to the database:
    //orderID, accountID, orderProgress, orderCancelled, orderConfirmed, editingEnabled, dateCreated, dateSubmitted, totalOrderPrice
    public void addOrder(int orderID, int userID, String email, int orderProgress, boolean orderCancelled, boolean orderConfirmed, boolean editingEnabled, String dateCreated, String dateSubmitted, double totalOrderPrice, String ordererName, String ordererAddress, String ordererPhone) throws SQLException {
        statement.executeUpdate("INSERT INTO iotadmin.OrderTable " + "VALUES(" + orderID + ", " + userID + ", '" + email + "', " + orderProgress + ", " + orderCancelled + ", " + orderConfirmed + ", " + editingEnabled + ", '" + dateCreated + "', '" + dateSubmitted + "', " + totalOrderPrice + ", '" + ordererName + "', '" + ordererAddress + "', '" + ordererPhone + "')");
    }
    */
    
    public void addOrder(int orderID, int userID, int orderProgress, boolean orderCancelled, boolean orderConfirmed, boolean editingEnabled, String dateCreated, String dateSubmitted, double totalOrderPrice, String ordererName, String ordererAddress, String ordererPhone, int productID) throws SQLException {
        statement.executeUpdate("INSERT INTO iotadmin.OrderTable " + "VALUES(" + orderID + ", " + userID + ", " + orderProgress + ", " + orderCancelled + ", " + orderConfirmed + ", " + editingEnabled + ", '" + dateCreated + "', '" + dateSubmitted + "', " + totalOrderPrice + ", '" + ordererName + "', '" + ordererAddress + "', '" + ordererPhone + "', " + productID + ")");
    }

//update an existing order in the database:  
    //also used for cancel order (rather than delete) as record needs to stay in system.
    public void updateOrder(int orderID, String email, int orderProgress, boolean orderCancelled, boolean orderConfirmed, boolean editingEnabled, String dateCreated, String dateSubmitted, double totalOrderPrice, String ordererName, String ordererAddress, String ordererPhone) throws SQLException {
        statement.executeUpdate("UPDATE iotadmin.OrderTable SET USEREMAIL= '" + email + "', ORDERPROGRESS= " + orderProgress + ", ORDERCANCELLED= " + orderCancelled + ", ORDERCONFIRMED= " + orderConfirmed + ", EDITINGENABLED= " + editingEnabled + ", DATECREATED= '" + dateCreated + "', DATESUBMITTED= '" + dateSubmitted + "', TOTALORDERPRICE= " + totalOrderPrice + ", ORDERERNAME= '" + ordererName + "', ordererAddress= '" + ordererAddress + "', ordererPhone= '" + ordererPhone + "' WHERE ORDERID= " + orderID);
    }

//delete an order from the database:
    public void deleteOrder(int orderID) throws SQLException {
        statement.executeUpdate("DELETE FROM iotadmin.OrderTable WHERE ORDERID= " + orderID);
    }

//Fetch Orders (for use when customers need to check their list of saved orders?)    
    public ArrayList<Order> fetchOrders() throws SQLException {
        String fetch = "SELECT * FROM iotadmin.OrderTable";
        ResultSet rs = statement.executeQuery(fetch);
        ArrayList<Order> temp = new ArrayList();

        while (rs.next()) {
            
            int orderID = rs.getInt(1);
            String userEmail = rs.getString(2);
            int orderProgress = rs.getInt(3);
            boolean orderCancelled = rs.getBoolean(4);
            boolean orderConfirmed = rs.getBoolean(5);
            boolean ordereditingEnabled = rs.getBoolean(6);
            String dateCreated = rs.getString(7);
            String dateSubmitted = rs.getString(8);
            double totalOrderPrice = rs.getDouble(9);
            String ordererName = rs.getString(10);
            String ordererAddress = rs.getString(11);
            String ordererPhone = rs.getString(12);
            int productID = rs.getInt(13);
            
            Order o = new Order(orderID, userEmail, orderProgress, orderCancelled, orderConfirmed, ordereditingEnabled, dateCreated, dateSubmitted, totalOrderPrice, ordererName, ordererAddress, ordererPhone, productID);
            temp.add(o);
        }
        return temp;
    }
     
    public Order fetchOrder(int orderID) throws SQLException {
        String fetch = "SELECT * FROM iotadmin.OrderTable WHERE ORDERID =" + orderID;
        ResultSet rs = statement.executeQuery(fetch);
        Order order = new Order();

        while (rs.next()) {
            
            String userEmail = rs.getString(2);
            int orderProgress = rs.getInt(3);
            boolean orderCancelled = rs.getBoolean(4);
            boolean orderConfirmed = rs.getBoolean(5);
            boolean ordereditingEnabled = rs.getBoolean(6);
            String dateCreated = rs.getString(7);
            String dateSubmitted = rs.getString(8);
            double totalOrderPrice = rs.getDouble(9);
            String ordererName = rs.getString(10);
            String ordererAddress = rs.getString(11);
            String ordererPhone = rs.getString(12);
            int productID = rs.getInt(13);
            
            order = new Order(orderID, userEmail, orderProgress, orderCancelled, orderConfirmed, ordereditingEnabled, dateCreated, dateSubmitted, totalOrderPrice, ordererName, ordererAddress, ordererPhone, productID);
        }
        return order;
    }
 
    //get the product associated with an order.
    //SHOULD do this for a LIST of products, but for now, will have to do just one product.
    public int getProductIDOnOrder(int orderID) throws SQLException {
        Order tempOrder = fetchOrder(orderID);
        int orderProductID = tempOrder.getProductID();
        return orderProductID;
    }
    
    
    //fetch product from product table...
    public Product fetchProduct(int productID) throws SQLException {
        String fetch = "SELECT * FROM iotadmin.Products WHERE PRODUCTID =" + productID;
        ResultSet rs = statement.executeQuery(fetch);
        Product product = new Product("", "", 0, "", "", 0.0);

        while (rs.next()) {
            
            String name = rs.getString(2);
            String description = rs.getString(3);
            int quantity = rs.getInt(4);
            String category = rs.getString(5);
            String supplier = rs.getString(6);
            double price = rs.getDouble(7);
            
            product = new Product(name, description, quantity, category, supplier, price);
        }
        return product;
    }
    
    
    //Get the MAX existing orderID in the DB.
    public int getMaxExistingOrderID() throws SQLException {
        ArrayList <Order> currentOrders = fetchOrders();
        int size = currentOrders.size();
        int highestID = 0;
        for (int i = 0; i < size; i++) {
            if (currentOrders.get(i) != null ) {
                if (currentOrders.get(i).getOrderID() > highestID) {
                    highestID = currentOrders.get(i).getOrderID();
                }
            }                
        }
        return highestID;
    }
    
        //test this later as more efficient way to get maxid
        public int getMaxExistingOrderID2() throws SQLException {
        String fetch = "SELECT MAX(ORDERID) FROM iotadmin.OrderTable";
        ResultSet rs = statement.executeQuery(fetch);

        while (rs.next()) {
            
            return rs.getInt(1);
        }
        return 0;
    }
 
    
    
    //get price of the products in an order:
    //REQUIRES PRODUCTS TO BE SET UP. DEFAULT RESPONSE FOR NOW.
    public double getTotalPriceOfOrder(int orderID) throws SQLException {
        //Need products set up to proceed...
        //Temporarily, let's do...
        double tempPrice = fetchProduct(orderID).getPrice();
        return tempPrice;
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
