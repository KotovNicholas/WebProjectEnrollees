import com.mysql.cj.jdbc.MysqlDataSource;
import org.junit.Test;
import ua.training.model.dao.DaoConnection;
import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.UserDao;
import ua.training.model.entities.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

/**
 * Created by user on 29.01.2017.
 */
public class TestConnection {

    @Test
    public void checkConViaData() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("SelectionCommittee");
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");
        if (rs.next()) {
            System.out.println("index: " + rs.getString(1) + " users: " + rs.getString(2));
        }

        conn.close();
    }
}
