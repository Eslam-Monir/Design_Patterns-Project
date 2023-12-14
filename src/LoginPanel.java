import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginPanel {
    User logged_in_user;

    public void logIN(Statement connectionStatement, String email, String password){

        try {
                UserFactory factory=new UserFactory();
            if(email.equals("Admin@gmail.com") && password.equals("123")){
                StoreSystem.loggedUser=new Admin();

            }
            else {

                ResultSet res = connectionStatement.executeQuery("select * from customer where email=" + email + " and password =" + password);
                res.next();
                StoreSystem.loggedUser=new Customer(res.getString("name"),res.getString("password"),res.getString("email")
                        ,0,res.getInt("credit_card_no")
                        ,res.getInt("age"),res.getString("gemder"));


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void Register(Statement connectionStatement,String name ,String password,String email,int ssn,int credit_card_no,int age, String gender){
        try {
            connectionStatement.executeUpdate("INSERT INTO `StoreDB`.`Customer` (`name`, `password`, `email`, `ssn`, `credit_card_no\n`, `age`, `type`) VALUES ('"+ name+"' , '" + password + "', '" + email + "', '" + ssn + "', '" + credit_card_no + "', '" + age + "', '" + gender + "')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
