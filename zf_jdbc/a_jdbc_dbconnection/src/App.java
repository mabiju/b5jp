import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");
            if (con != null) {
                System.out.println("Database connected successfully.");
            } else {
                System.out.println("Something went wrong.");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error = " + e);
        }
    }
}
