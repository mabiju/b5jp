import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        String userid = "ram";
        String userpwd = "ram@123";
        String userfullname = "Ram Thapa";
        String useremail = "ram@gmail.com";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establishing connetion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "");

            Statement stmt = con.createStatement();

            // inserting data into database table
            String query = "insert into users values('" + userid + "', '" + userpwd + "','" + userfullname + "','"
                    + useremail + "')";
            int a = stmt.executeUpdate(query);
            if (a > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Something went wrong....");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
