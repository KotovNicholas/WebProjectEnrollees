package ua.training.model.dao.jdbc;

import ua.training.model.dao.DaoConnection;
import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.UserDao;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by user on 28.01.2017.
 */
public class JdbcDaoFactory extends DaoFactory {

    private static final String DB_URL = "url";
    private DataSource dataSource;

    public JdbcDaoFactory() {
        try{

            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("java:comp/env/jdbc/SelectionCommittee");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public UserDao createUserDao() {
        return null;
    }

    @Override
    public UserDao createUserDao(DaoConnection connection) {
        JdbcDaoConnection jdbcConnection = (JdbcDaoConnection)connection;
        Connection sqlConnection = jdbcConnection.getConnection();
        return new JdbcUserDao(sqlConnection);
    }

    @Override
    public DaoConnection getConnection() {
        try {
            return new JdbcDaoConnection( dataSource.getConnection() );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
