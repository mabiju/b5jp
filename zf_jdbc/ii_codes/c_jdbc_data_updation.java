package zf_jdbc.ii_codes;

// Java program to illustrate updating the Database
import java.sql.*;

// public class App {   // use this in real scenario
public class c_jdbc_data_updation {
    public static void main(String[] args) throws Exception {
        String userid = "ram";
        String password = "ram@123";
        String newpassword = "@123ram";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establishing connetion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");

            Statement stmt = con.createStatement();

            // updating data into database table
            String query = "update users set pwd ='" + newpassword + "' where id = '" + userid
                    + "' and pwd = '" + password + "' ";
            int a = stmt.executeUpdate(query);
            if (a > 0) {
                System.out.println("Data updated successfully.");
            } else {
                System.out.println("Something went wrong....");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
