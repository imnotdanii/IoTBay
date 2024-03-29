package controller;

/**
 *
 * @author cdanielle
 */
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpSession;

public class Validator implements Serializable {

    private final String emailPattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";
    private final String namePattern = "([A-Z][a-z]+[\\s])+[A-Z][a-z]*";
    private final String passwordPattern = "[a-z0-9]{4,}";
    private final String cnumberPattern = "[0-9]{16,}";
    private final String cvvPattern = "[0-9]{3,}";
        private final String phonePattern = "[a-z0-9]{4,}";


    public Validator() {
    }

    public boolean validate(String pattern, String input) {
        Pattern regEx = Pattern.compile(pattern);
        Matcher match = regEx.matcher(input);
        return match.matches();

    }

    public boolean checkEmpty(String email, String password) {
        return email.isEmpty() || password.isEmpty();
    }

    public boolean validateEmail(String email) {
        return validate(emailPattern, email);
    }

    public boolean validateName(String name) {
        return validate(namePattern, name);
    }

    public boolean validatePassword(String password) {
        return validate(passwordPattern, password);
    }

    public void clear(HttpSession session) {
        session.setAttribute("emailErr", "Enter email");
        session.setAttribute("passErr", "Enter password");
        session.setAttribute("existErr", "");
        session.setAttribute("nameErr", "Enter name");

    }

    public boolean validateCNumber(String CNumber) {
        return validate(cnumberPattern, CNumber);
    }

    public boolean validateCVV(String cvv) {
        return validate(cvvPattern, cvv);
    }
    
   public boolean validatePhone(String phone) {
        return validate(phonePattern, phone);
    }
}
