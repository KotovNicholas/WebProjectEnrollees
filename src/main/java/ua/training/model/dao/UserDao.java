package ua.training.model.dao;

import ua.training.model.entities.User;

import java.util.Optional;

/**
 * Created by user on 28.01.2017.
 */
public interface UserDao  extends GenericDao<UserDao> {

    Optional<User> getUserByEmail(String email);
}

