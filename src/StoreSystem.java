import java.util.ArrayList;
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

    public void getAllCategories(Statement connectionStatement){

        try {
            ResultSet res = connectionStatement.executeQuery("select * from category");
            ArrayList<Category> allCategories=new ArrayList<Category>();
            while(res.next()){
                Category category=new Category(res.getInt("id"),res.getString("name"));
                allCategories.add(category);
            }

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }
    }
    public void getAllProducts(Statement connectionStatement){

        try {
            ResultSet res = connectionStatement.executeQuery("select * from items");
            ArrayList<Product> allProducts=new ArrayList<Product>();
            while(res.next()){
                Product product=new Product(res.getInt("id"),res.getInt("quantity"),res.getInt("price"),res.getInt("discount"),res.getString("name"),res.getString("image"));
                allProducts.add(product);
            }

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }
    }

}
