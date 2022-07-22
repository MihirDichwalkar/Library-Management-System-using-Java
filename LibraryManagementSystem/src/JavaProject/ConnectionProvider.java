
package JavaProject;
import java.sql.*;
/**
 *
 * @author vinee
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
