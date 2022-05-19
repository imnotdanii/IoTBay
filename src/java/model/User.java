package model;

/**
 *
 * @author cdanielle
 */
public class User {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
    private String dob;
//NAME, ADDRESS, PHONE, DOB, EMAIL, PASSWORD
    //payment details and payment history to be added later.

    public User(String name, String address, String phone, String dob, String email, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
}