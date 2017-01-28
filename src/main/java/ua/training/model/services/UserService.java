package ua.training.model.services;

import ua.training.model.dao.DaoConnection;
import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.UserDao;
import ua.training.model.entities.User;

import java.util.Optional;

/**
 * Created by user on 28.01.2017.
 */
public class UserService {
    private DaoFactory daoFactory = DaoFactory.getInstance();

    private static class Holder{
        static final UserService INSTANCE = new UserService();
    }

    public static UserService getInstance(){
        return Holder.INSTANCE;
    }

    public Optional<User> login (String email , String password){
        try( DaoConnection connection = daoFactory.getConnection() ){
            connection.begin();
            UserDao dao = daoFactory.createUserDao(connection);
            return dao.getUserByEmail(email)
                    .filter(user -> password.equals(user.getPassword()));
        }
    }
}
