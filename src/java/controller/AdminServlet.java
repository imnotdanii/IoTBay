/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author kingsleybyrne
 */
public class AdminServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //2- create an instance of the Validator class  
        Validator validator = new Validator();
        User user=null;
        //3- capture the posted email      
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        //5- retrieve the manager instance from session  
        DBManager manager = (DBManager) session.getAttribute("manager");
        validator.clear(session);

        if (!validator.validateName(name)) {
            System.out.println("wrong email");
            session.setAttribute("emailErr", "Error: Email incorrect");
            request.getRequestDispatcher("adminprofile.jsp").include(request, response);
        }else if (!validator.validatePhone(phone)) {
            System.out.println("wrong phone number");
            session.setAttribute("passErr", "Error: phone incorrect");
            request.getRequestDispatcher("adminProfile.jsp").include(request, response);
        } else {
            try {
                user = manager.findUserProfile(name, phone);
                if (user != null) {
                    System.out.println(user.getName());
                    System.out.println("user found");
                    session.setAttribute("user", user);
                    request.getRequestDispatcher("editUser.jsp").include(request, response);
                } else {
                    System.out.println("user not found");
                    session.setAttribute("existErr", "Oops! No user found.");
                    request.getRequestDispatcher("adminProfile.jsp").include(request, response);
                }
                //6- find user by email and password
            } catch (SQLException | NullPointerException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage() == null ? "User does not exist":"");
            }
        }
    }
    

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
        //1- retrieve the current session
//        HttpSession session = request.getSession();
//        //2- create an instance of the Validator class  
//        Validator validator = new Validator();
//        User user=null;
//        //3- capture the posted email      
//        String email = request.getParameter("email");
//        String phone = request.getParameter("phone");
//        //5- retrieve the manager instance from session  
//        DBManager manager = (DBManager) session.getAttribute("manager");
//        validator.clear(session);
//
//        if (!validator.validateEmail(email)) {
//            System.out.println("wrong email");
//            session.setAttribute("emailErr", "Error: Email incorrect");
//            request.getRequestDispatcher("adminprofile.jsp").include(request, response);
//        }else if (!validator.validatePhone(phone)) {
//            System.out.println("wrong phone number");
//            session.setAttribute("passErr", "Error: phone incorrect");
//            request.getRequestDispatcher("adminProfile.jsp").include(request, response);
//        } else {
//            try {
//                user = manager.findUserProfile(email, phone);
//                if (user != null) {
//                    System.out.println(user.getName());
//                    System.out.println("user found");
//                    session.setAttribute("user", user);
//                    request.getRequestDispatcher("editUser.jsp").include(request, response);
//                } else {
//                    System.out.println("user not found");
//                    session.setAttribute("existErr", "Oops! No user found.");
//                    request.getRequestDispatcher("adminProfile.jsp").include(request, response);
//                }
//                //6- find user by email and password
//            } catch (SQLException | NullPointerException ex) {
//                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.println(ex.getMessage() == null ? "User does not exist":"");
//            }
//        }
//    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
}