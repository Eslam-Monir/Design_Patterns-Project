
import java.sql.*;
public class  StoreSystem {
    public User loggedUser;


    private StoreSystem() {
    }

    private static StoreSystem instance=new StoreSystem();

    public static StoreSystem getInstance() {
        return instance;
    }

    // Creates a Connection and returns a statement that could be used for DB statements

}
