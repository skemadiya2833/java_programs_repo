import java.sql.*;

public class sqlexceptionHandling 
{
    public static void main(String[] args) 
    {
        try
        {
            Connection conn = DriverManager.getConnection("abc", "dcd", "notpresent");
            System.out.println(conn.getSchema());
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
