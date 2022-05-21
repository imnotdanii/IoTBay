package model.dao;

import java.sql.Connection;


/**
 *
 * @author cdanielle
 */
public abstract class DB {
    protected String URL = "jdbc:derby://localhost:1527/"; //"jdbc:derby://localhost:1527/";//replace this string with your jdbc:derby local host url   
    protected String db = "IoTBay"; //"IoTBay";//name of the database 
    protected String dbuser = "iotadmin";//db root user   
    protected String dbpass = "abc123"; //db root password   
    protected String driver = "org.apache.derby.jdbc.ClientDriver"; //jdbc client driver - built in with NetBeans   
    protected Connection conn; //connection null-instance to be initialized in sub-classes
}
