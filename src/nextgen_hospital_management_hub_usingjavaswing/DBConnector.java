package nextgen_hospital_management_hub_usingjavaswing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector
{
    public String dbusername, dbpassword, dbname, dbserveraddress;
    public Connection dbcon;   
    
    public DBConnector(String dbusername, String dbpassword, String dbname, String dbserveraddress)
    {
        this.dbusername = dbusername;
        this.dbpassword = dbpassword;
        this.dbname = dbname;
        this.dbserveraddress = dbserveraddress;
    }
    
    void connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        this.dbcon = DriverManager.getConnection("jdbc:mysql://"+this.dbserveraddress+"/"+this.dbname,dbusername,dbpassword);
    }
}