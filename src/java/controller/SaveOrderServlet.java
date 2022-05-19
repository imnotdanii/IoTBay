package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Order;
import model.dao.DBManager;

/**
 *
 * @author dylanstyman
 */
public class SaveOrderServlet extends HttpServlet {
    
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
//        String variable = request.getParameter("variable"); //repeat for others.
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        //Not sure what this actually does? Assume from what you have done it redirects?
        //Assume that a user is logged in. Figure out the logged out portion later.
        /*
        1. get User. User user = xxxx
        2. db.addorder()
        3. 
        */
        request.getRequestDispatcher("PaymentDetails.jsp").include(request, response);
    }
}
