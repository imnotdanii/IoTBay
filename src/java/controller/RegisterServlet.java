/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import model.dao.DBManager;

/**
 *
 * @author cdanielle
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1- retrieve the current session
        HttpSession session = request.getSession();
        //2- create an instance of the Validator class  
        Validator validator = new Validator();
        //3- capture the posted information      
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone-number");
        String dob = request.getParameter("dob");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        //5- retrieve the manager instance from session  
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        validator.clear(session);

        if (!validator.validateEmail(email)) {
            session.setAttribute("emailErr", "Error: Email format incorrect");
            request.getRequestDispatcher("register.jsp").include(request, response);
        } else if (!validator.validatePassword(password)) {
            session.setAttribute("passErr", "Error: password format incorrect");
            request.getRequestDispatcher("register.jsp").include(request, response);
        } else {
            try {
                User exists = db.findUser(email, password);
                if (exists != null) {
                    session.setAttribute("existErr", "There is already account connected to this email.");
                    request.getRequestDispatcher("register.jsp").include(request, response);
                } else {
                    db.addUser(name, address, phone, dob, email, password);
                    User user = new User(name, address, phone, dob, email, password);
                    session.setAttribute("user", user);
                    System.out.println(user.getName());
                    request.getRequestDispatcher("index.jsp").include(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
