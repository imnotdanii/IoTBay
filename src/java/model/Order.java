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
    private double totalOrderPrice;
    private boolean orderCancelled;
    private boolean orderConfirmed;
    private boolean editingEnabled; //for later (while true, save every 30 sec?)
    private String dateCreated; // is there a way to make this final w/o initialising yet?
    private String dateSubmitted;
    private LinkedList <Product> productsInOrder; //list of products on order
    
    // Constructor:

    public Order(int orderID, String email, int orderProgress, double totalOrderPrice, boolean orderCancelled, boolean orderConfirmed, boolean editingEnabled, String dateCreated, String dateSubmitted, LinkedList<Product> productsInOrder) {
        this.orderID = orderID;
        this.email = email;
        this.orderProgress = orderProgress;
        this.totalOrderPrice = totalOrderPrice;
        this.orderCancelled = orderCancelled;
        this.orderConfirmed = orderConfirmed;
        this.editingEnabled = editingEnabled;
        this.dateCreated = dateCreated;
        this.dateSubmitted = dateSubmitted;
        this.productsInOrder = productsInOrder;
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