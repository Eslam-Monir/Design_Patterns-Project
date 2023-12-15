import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class User {
    private String name,password;
    int id;
    boolean isAdmin=false;
    public User() {

    }

    public User(String name,int id, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  void updatePersonalInfo( String new_name, Statement connectionStatement){

        try {
            String sql = "UPDATE customer SET name='" + new_name + "'WHERE name='" + this.name + "'";
            this.setName(new_name);
            connectionStatement.executeUpdate(sql);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void addToCart( Statement connectionStatement,int p_id){
        try {
            String sql = "SELECT * FROM `StoreDB`.`cart` WHERE userid="+ this.id+ " And product_id=" +p_id;

         ResultSet set= connectionStatement.executeQuery(sql);
            if (!set.next()) {
                // Result set is empty, insert a new entry
                String insertQuery = "INSERT INTO cart (userid, product_id, product_quantity) VALUES ('"+this.id+"', '"+p_id+"', 1)";
                connectionStatement.executeUpdate(insertQuery);
            } else {
                // Result set is not empty, update the quantity column
                int currentQuantity = set.getInt("product_quantity");
                int updatedQuantity = currentQuantity + 1;

                String updateQuery = "UPDATE cart SET product_quantity = " + updatedQuantity + "WHERE userid="+ this.id+ " And product_id=" +p_id;
                connectionStatement.executeUpdate(updateQuery);




            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
}
