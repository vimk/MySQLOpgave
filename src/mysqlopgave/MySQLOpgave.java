//opgave i skolen omkring database
package mysqlopgave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vimk
 */
public class MySQLOpgave {

    public static void main(String[] args) {
        try{
        
        String host;
        String uName;
        String uPass;

        host = "jdbc:derby://localhost:1527";
        uName = "root";
        uPass = "yhdxyady";

        Connection con = DriverManager.getConnection(host, uName, uPass);
        }
        
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
    }
    
    
}

