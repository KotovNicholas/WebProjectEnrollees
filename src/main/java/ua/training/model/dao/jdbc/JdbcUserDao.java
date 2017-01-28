package ua.training.model.dao.jdbc;

import ua.training.model.dao.UserDao;
import ua.training.model.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 * Created by user on 28.01.2017.
 */
public class JdbcUserDao implements UserDao {

    private static final String SELECT_PERSON_BY_LOGIN =
            "SELECT * FROM users WHERE lower(email) = ?";
    private Connection connection;


    JdbcUserDao(Connection connection) {
        super();
        this.connection = connection;
    }

    @Override
    public Optional<UserDao> find(int id) {
        return null;
    }

    @Override
    public List<UserDao> findAll() {
        return null;
    }

    @Override
    public void create(UserDao userDao) {

    }

    @Override
    public void update(UserDao UserDao) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        Optional<User> result = Optional.empty();

        try(PreparedStatement query =
                    connection.prepareStatement(SELECT_PERSON_BY_LOGIN) ){
            query.setString( 1, email.toLowerCase() );
            ResultSet rs = query.executeQuery();
            if( rs.next() ){
                User user = getUserFromResultSet(rs);
                result = Optional.of(user);
            }

        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }

        return result;

    }

    private User getUserFromResultSet(ResultSet rs) throws SQLException {
        User user = new User.Builder()
                .setId(rs.getInt("id"))
                .setEmail(rs.getString("email"))
                .setPassword(rs.getString("password"))
                .setFirstName(rs.getString("first_name"))
                .setLastName(rs.getString("last_name"))
                .setLogin(rs.getString("login"))
                .setRole(rs.getString("role"))
                .build();
        return user;
    }
}

