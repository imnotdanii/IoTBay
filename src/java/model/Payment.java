package model;

/**
 *
 * @author Dan Yi
 */
public class Payment {
    
    String COname;
    String CNumber;
    String expiryDate;
    String cvv;

    public Payment(String COname, String CNumber, String expiryDate, String cvv) {
        this.COname = COname;
        this.CNumber = CNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getCOname() {
        return COname;
    }

    public String getCNumber() {
        return CNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCVV() {
        return cvv;
    }

    public void setCOName(String COname) {
        this.COname = COname;
    }

    public void setCNumber(String CNumber) {
        this.CNumber = CNumber;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.expiryDate = ExpiryDate;
    }

    public void setCvv(String CVV) {
        this.cvv = CVV;
    }
     
}
