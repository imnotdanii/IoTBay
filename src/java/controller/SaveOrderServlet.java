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
 */
public class SaveOrderServlet extends HttpServlet {

//get current date/time stamp.
    private String findDate() {
        String date;
        LocalDate localDate= java.time.LocalDate.now(); // how to retrieve current time?
        date = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        return date;
    }
    
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        //Assume that a user is logged in. Figure out the logged out portion later.
        
        /*
        1. get User. User user = xxxx
        2. (etc) 
        3.db.addorder(int orderID, String email, int orderProgress, boolean orderCancelled, boolean orderConfirmed, boolean editingEnabled, String dateCreated, String dateSubmitted, double totalOrderPrice) throws SQLException);
        */
        
        User user = (User) session.getAttribute("user");
        //get parameters from previous form:
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone-number");
        String email = request.getParameter("email");
        //create ORDER specific parameters...
        int orderID;
        int orderProgress; //Int so that additional steps can be added and ID'd if needed...
        boolean orderCancelled;
        boolean orderConfirmed;
        boolean editingEnabled;
        String dateCreated = null; //get today's date...
        String dateSubmitted = null;
        double totalOrderPrice;
        
        //delegate relevant actions:
        if (request.getParameter("button1") != null) {
            //Set variables for SAVE ORDER: (as this is CREATING order, some of these variables will be set...)
            orderProgress = 0;
            orderCancelled = false;
            orderConfirmed = false;
            editingEnabled = false;
            dateCreated = findDate();
            try {
                orderID = (db.getMaxExistingOrderID() + 1);
                totalOrderPrice = db.getTotalPriceOfOrder(orderID);
                //Save Order actions.
                db.addOrder(orderID, email, orderProgress, orderCancelled, orderConfirmed, editingEnabled, dateCreated, dateSubmitted, totalOrderPrice, name, address, phone);
                //db.addOrderToUser(email);
                
            } catch (SQLException ex) {
                Logger.getLogger(SaveOrderServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Need to pass through outcomeMessage String "Order was saved" or such...
            request.getRequestDispatcher("orderOutcomePage.jsp").include(request, response);
        } 
        else if (request.getParameter("button2") != null) {
            //
            orderProgress = 1;
            orderCancelled = false;
            orderConfirmed = true;
            editingEnabled = false;
            dateCreated = findDate();
            dateSubmitted = findDate();
            try {
                orderID = (db.getMaxExistingOrderID() + 1);
                totalOrderPrice = db.getTotalPriceOfOrder(orderID);
                //Save Order actions.
                db.addOrder(orderID, email, orderProgress, orderCancelled, orderConfirmed, editingEnabled, dateCreated, dateSubmitted, totalOrderPrice, name, address, phone);
                //db.updateOrder(orderID, email, orderProgress, orderCancelled, orderConfirmed, editingEnabled, dateCreated, dateSubmitted, totalOrderPrice, name, address, phone);
                //db.addOrderToUser(email);
                
            } catch (SQLException ex) {
                Logger.getLogger(SaveOrderServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Proceed to Payment actions.
            request.getRequestDispatcher("PaymentDetails.jsp").include(request, response);
        }
        else if (request.getParameter("button3") != null) {
             
            orderProgress = 0;
            orderCancelled = true;
            orderConfirmed = false;
            editingEnabled = false;
            dateCreated = findDate();
            try {
                orderID = (db.getMaxExistingOrderID() + 1);
                totalOrderPrice = db.getTotalPriceOfOrder(orderID);
                //Save Order actions.
                db.updateOrder(orderID, email, orderProgress, orderCancelled, orderConfirmed, editingEnabled, dateCreated, dateSubmitted, totalOrderPrice, name, address, phone);
                //db.addOrderToUser(email);
                
            } catch (SQLException ex) {
                Logger.getLogger(SaveOrderServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Cancel Order Actions.
            //db.updateOrder();
            //db.removeOrderFromUser();
            request.getRequestDispatcher("orderOutcomePage.jsp").include(request, response);
        }
    }
}
