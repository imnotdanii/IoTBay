/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.User;

/**
 *
 * @author cdanielle
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
    public void updateUser(String name, String address, String phone, String dob, String email, String password) throws SQLException{
        statement.executeUpdate("UPDATE iotadmin.Users SET NAME='" + name + "', ADDRESS='" + address + "', PHONE='" + phone + "', DOB='" + dob + "', EMAIL='" + email + "', PASSWORD='"+ password +"' WHERE EMAIL ='"+email+"'" );
    }

//delete a user from the database   
    public void deleteUser(String email) throws SQLException {
        statement.executeUpdate("DELETE FROM iotadmin.Users WHERE EMAIL='" + email + "'");

    }

   
}
