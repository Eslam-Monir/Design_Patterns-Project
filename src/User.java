import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public abstract class User {
    private String name,password;
    boolean isAdmin=false;
    public User() {

    }

    public User(String name, String password) {
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

}
