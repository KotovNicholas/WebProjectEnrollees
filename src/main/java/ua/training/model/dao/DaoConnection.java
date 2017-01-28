package ua.training.model.dao;

/**
 * Created by user on 28.01.2017.
 */
public interface DaoConnection extends AutoCloseable {
    void begin();
    void commit();
    void rollback();
    void close();
}
