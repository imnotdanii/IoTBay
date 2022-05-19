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
        String variable = request.getParameter("variable"); //repeat for others.
        
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        //Not sure what this actually does? Assume from what you have done it redirects?
        request.getRequestDispatcher("confirmOrderPage.jsp").include(request, response);
    }
    
}
