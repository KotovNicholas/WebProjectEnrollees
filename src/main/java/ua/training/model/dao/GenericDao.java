package ua.training.model.dao;

import java.util.List;
import java.util.Optional;

/**
 * Created by user on 28.01.2017.
 */
public interface GenericDao<E> {
    Optional<E> find(int id);
    List<E> findAll();
    void create(E e);
    void update(E e);
    void delete(int id);
}
