import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginPanel {
    User logged_in_user;

    public void logIN(Statement connectionStatement, String email, String password){

        try {
          ResultSet res= connectionStatement.executeQuery("select * from user where email="+email+ " and password ="+password);
          res.next();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
