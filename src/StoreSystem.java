
import java.sql.*;
public class  StoreSystem {
    public static User loggedUser;


    private StoreSystem() {
    }

    private static StoreSystem instance=new StoreSystem();

    public static StoreSystem getInstance() {
        return instance;
    }

    public  void  add_Category(String category,Connection conn){
        try {
            String sql = "INSERT INTO category (name) values('"+category +"')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public  void edit_category(String old_name,String new_name,Connection conn){

        try {
            String sql = "UPDATE Category SET name='" + new_name + "'WHERE name='" + old_name + "'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public  void delete_category(String name,Connection conn){

        try {
            String sql = "DELETE FROM Category WHERE name='"+name+"'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
