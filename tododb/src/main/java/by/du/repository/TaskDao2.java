package by.du.repository;

import by.du.model.Task;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class TaskDao2 extends AbstractDao<Task> {

    private static final String SELECT_BY_ID = "select * from task where id = ?";
    private static final String SELECT_ALL = "select * from task";
    private static final String SELECT_BETWEEN = "select * from task where start_date between ? and ?";

    private static final String INSERT = "insert into task (isDone, description, start_date) VALUES(?, ?, ?)";
    private static final String DELETE = "delete from task where id = ?";
    private static final String UPDATE = "update task set isDone=?, description=?, start_date=? where id = ?";

    @Override
    protected String getSqlSelectById() {
        return SELECT_BY_ID;
    }

    @Override
    protected Optional<Task> findById(int id, PreparedStatement st) throws SQLException {
        st.setInt(1, id);
        try (final ResultSet rs = st.executeQuery()) {
            if (rs.next()) {
                return Optional.of(Task.builder()
                        .id(rs.getInt("id"))
                        .isDone(rs.getBoolean("isDone"))
                        .desc(rs.getString("description"))
                        .date(rs.getDate("start_date").toLocalDate())
                        .build());
            }
            return Optional.empty();
        }
    }
}
