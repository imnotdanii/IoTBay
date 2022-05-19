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
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1- retrieve the current session
        HttpSession session = request.getSession();
        //2- create an instance of the Validator class  
        Validator validator = new Validator();
        //3- capture the posted email      
        String email = request.getParameter("email");
        //4- capture the posted password    
        String password = request.getParameter("password");
        //5- retrieve the manager instance from session  
        DBManager manager = (DBManager) session.getAttribute("manager");
        User user = null;
        validator.clear(session);

        if (!validator.validateEmail(email)) {
            session.setAttribute("emailErr", "Error: Email format incorrect");
            request.getRequestDispatcher("deleteUser.jsp").include(request, response);
        } else if (!validator.validatePassword(password)) {
            session.setAttribute("passErr", "Error: password format incorrect");
            request.getRequestDispatcher("deleteUser.jsp").include(request, response);
        } else {
            try {
                user = manager.findUser(email, password);
                if (user != null) {
                    manager.deleteUser(email);
                    session.invalidate();
                    request.getRequestDispatcher("index.jsp").include(request, response);
                } else {
                    System.out.println("user not found");
                    session.setAttribute("existErr", "Oops! No user found.");
                    request.getRequestDispatcher("deleteUser.jsp").include(request, response);
                }
                //6- find user by email and password
            } catch (SQLException | NullPointerException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage() == null ? "User does not exist" : "User deleted");
            }
        }
    }
}
