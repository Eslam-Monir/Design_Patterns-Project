import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreDB", "root", "");

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("Select * from StoreDB.users");
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}