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
import model.Payment;
import model.dao.DBManager;

/**
 *
 * @author dan
 */
public class PaymentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Validator validator = new Validator();  
        String COname = request.getParameter("COname");
        String CNumber = request.getParameter("CNumber");
        String expiryDate = request.getParameter("expiryDate");
        String cvv = request.getParameter("cvv");
        
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        validator.clear(session);
        if (!validator.validateCNumber(CNumber)) {
            session.setAttribute("CNumberErr", "Error: Card Number incorrect");
            request.getRequestDispatcher("PaymentDetails.jsp").include(request, response);
        } else if (!validator.validateCVV(cvv)) {
            session.setAttribute("cvvErr", "Error: CVV Code incorrect");
            request.getRequestDispatcher("PaymentDetails.jsp").include(request, response);
        } 
        
            request.getRequestDispatcher("PaymentDone.jsp").include(request, response);
       }
}
            