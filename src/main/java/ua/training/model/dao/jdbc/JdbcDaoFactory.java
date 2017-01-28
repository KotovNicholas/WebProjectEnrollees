package ua.training.model.dao.jdbc;

import ua.training.model.dao.DaoConnection;
import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.UserDao;

/**
 * Created by user on 28.01.2017.
 */
public class JdbcDaoFactory extends DaoFactory {


    @Override
    public DaoConnection getConnection() {
        return null;
    }

    @Override
    public UserDao createUserDao() {
        return null;
    }

    @Override
    public UserDao createUserDao(DaoConnection connection) {
        return null;
    }
}
