package model;
import java.util.LinkedList;

/*
 * @author dylanstyman
 * Version 1
 */

public class Order {
    private int orderID;
    //private Account userAccount;
    private String email;
    private int orderProgress;
    private boolean orderCancelled;
    private boolean orderConfirmed;
    private boolean editingEnabled; //for later (while true, save every 30 sec?)
    private String dateCreated; // is there a way to make this final w/o initialising yet?
    private String dateSubmitted;
    private double totalOrderPrice;
    private String ordererName;
    private String ordererAddress;
    private String ordererPhone;
    // can't implement as list at the moment. Do as single productID for now?
    private int productID; //temporary placeholder...
    private LinkedList <Product> productsInOrder; //list of products on order
    
    // Constructors:

    public Order(int orderID, String email, int orderProgress, boolean orderCancelled, boolean orderConfirmed, boolean editingEnabled, String dateCreated, String dateSubmitted, double totalOrderPrice, String ordrererName, String ordererAddress, String ordererPhone, int productID) { // add LinkedList<Product> productsInOrder
        this.orderID = orderID;
        this.email = email;
        this.orderProgress = orderProgress;
        this.orderCancelled = orderCancelled;
        this.orderConfirmed = orderConfirmed;
        this.editingEnabled = editingEnabled;
        this.dateCreated = dateCreated;
        this.dateSubmitted = dateSubmitted;
        this.totalOrderPrice = totalOrderPrice;
        this.ordererName = ordererName;
        this.ordererAddress = ordererAddress;
        this.ordererPhone = ordererPhone;
        this.productID = productID; //temp
        this.productsInOrder = productsInOrder;
    }
    
    public Order() { // add LinkedList<Product> productsInOrder
        this.orderID = 0;
        this.email = "";
        this.orderProgress = 0;
        this.orderCancelled = false;
        this.orderConfirmed = false;
        this.editingEnabled = false;
        this.dateCreated = "";
        this.dateSubmitted = "";
        this.totalOrderPrice = 0;
        this.ordererName = "";
        this.ordererAddress = "";
        this.ordererPhone = "";
        this.productID = 1; //make product #1 a default TEST product?
        this.productsInOrder = null;
    }    

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrderProgress(int orderProgress) {
        this.orderProgress = orderProgress;
    }

    public void setTotalOrderPrice(double totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    public void setOrderCancelled(boolean orderCancelled) {
        this.orderCancelled = orderCancelled;
    }

    public void setOrderConfirmed(boolean orderConfirmed) {
        this.orderConfirmed = orderConfirmed;
    }

    public void setEditingEnabled(boolean editingEnabled) {
        this.editingEnabled = editingEnabled;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateSubmitted(String dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public void setProductsInOrder(LinkedList<Product> productsInOrder) {
        this.productsInOrder = productsInOrder;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getEmail() {
        return email;
    }
    
    public int getProductID() {
        return productID;
    }

    public int getOrderProgress() {
        return orderProgress;
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public boolean isOrderCancelled() {
        return orderCancelled;
    }

    public boolean isOrderConfirmed() {
        return orderConfirmed;
    }

    public boolean isEditingEnabled() {
        return editingEnabled;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateSubmitted() {
        return dateSubmitted;
    }

    public LinkedList<Product> getProductsInOrder() {
        return productsInOrder;
    }
}