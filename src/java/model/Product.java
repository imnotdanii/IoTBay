package model;

/**
 *
 * @author cdanielle
 */
public class Product {

    private String name;
    private String description;
    private int quantity;
    private String category;
    private String supplier;
    private double price;

    public Product(String name, String description, int quantity, String category, String supplier, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
        this.supplier = supplier;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}


//INSERT INTO Products(name, description, quantity, category, supplier, price)
//VALUES
