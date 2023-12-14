import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args)  {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StoreDB", "root", "");

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("Select * from StoreDB.users");
            result.next();
            String username=result.toString();
            System.out.println(username);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}