import java.sql.Connection;          // Interface
import java.sql.DriverManager;       // Class to get connection
import java.sql.Statement;           // Interface
import java.sql.ResultSet;           // Interface

public class JDBCExample {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root");
        // We don't know actual implementation class
        // Driver provides it internally

        Statement stmt = con.createStatement();
        // Statement is interface

        ResultSet rs = stmt.executeQuery("SELECT * FROM users");

        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

        con.close();
    }
}
