package by.du.repository;

import by.du.exception.DbException;
import by.du.model.Event;
import by.du.model.Meeting;
import by.du.util.DbConn;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
public abstract class AbstractDao<T extends Event> implements Dao<T> {

    @Override
    public Optional<T> findById(int id) {
        final Connection connection = DbConn.INSTANCE.getConnection();
        try (final PreparedStatement st = connection.prepareStatement(getSqlSelectById())) {
            return findById(id, st);
        } catch (SQLException ex) {
            log.error("Error finding event", ex);
            throw new DbException(ex);
        }
    }

    protected abstract String getSqlSelectById();
    protected abstract Optional<T> findById(int id, PreparedStatement st) throws SQLException;

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public List<T> findAllBetween(LocalDateTime from, LocalDateTime to) {
        return null;
    }

    @Override
    public T create(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T update(T t) {
        return null;
    }
}
