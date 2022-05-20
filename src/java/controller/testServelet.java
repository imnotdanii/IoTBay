package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Order;
import model.User;
import model.dao.DBManager;

/**
 *
 * @author dylanstyman
 * 
 * FOR TESTING DIRECTIONALITY ONLY. NOT PART OF ASSIGNMENT.
 * 
 */

public class testServelet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        User user = (User) session.getAttribute("user");
        
        if (request.getParameter("button1") != null) {
            request.getRequestDispatcher("orderOutcomePage.jsp").include(request, response);
        }
        else if (request.getParameter("button2") != null) {
            request.getRequestDispatcher("PaymentDetails.jsp").include(request, response);
        }
        else if (request.getParameter("button3") != null) {
            request.getRequestDispatcher("orderOutcomePage.jsp").include(request, response);
        }
}
}
