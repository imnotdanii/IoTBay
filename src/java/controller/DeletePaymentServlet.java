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
 * @author dan
 */
public class DeletePaymentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        String COname = request.getParameter("COname");
        String CNumber = request.getParameter("CNumber");
        String ExpiryDate = request.getParameter("ExpiryDate");
        String CVV = request.getParameter("CVV");
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        validator.clear(session);
    }
}
