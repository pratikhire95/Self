package JDBCSBA;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

}
