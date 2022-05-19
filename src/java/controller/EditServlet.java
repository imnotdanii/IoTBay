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
public class EditServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone-number");
        String dob = request.getParameter("dob");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        DBManager db;
        db = (DBManager) session.getAttribute("manager");
        validator.clear(session);
//        request.getRequestDispatcher("editUser.jsp").include(request, response);
        if (!validator.validateEmail(email)) {
            session.setAttribute("emailErr", "Error: Email format incorrect");
            request.getRequestDispatcher("register.jsp").include(request, response);
        } else if (!validator.validatePassword(password)) {
            session.setAttribute("passErr", "Error: password format incorrect");
            request.getRequestDispatcher("register.jsp").include(request, response);
        } else {
            try {
                db.updateUser(name, address, phone, dob, email, password);
                User user = db.findUser(email, password);
                session.setAttribute("user", user);
                request.getRequestDispatcher("manageProfile.jsp").include(request, response);

            } catch (SQLException ex) {
                Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
