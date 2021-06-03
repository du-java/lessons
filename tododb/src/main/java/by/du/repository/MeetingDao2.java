package by.du.repository;

import by.du.model.Meeting;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class MeetingDao2 extends AbstractDao<Meeting> {

    private static final String SELECT_BY_ID = "select * from todo where id = ?";
    private static final String SELECT_ALL = "select * from todo";
    private static final String SELECT_BETWEEN = "select * from todo where start_time between ? and ?";

    private static final String INSERT = "insert into todo (place, description, start_time) VALUES(?, ?, ?)";
    private static final String DELETE = "delete from todo where id = ?";
    private static final String UPDATE = "update todo set place=?, description=?, start_time=? where id = ?";

    @Override
    protected String getSqlSelectById() {
        return SELECT_BY_ID;
    }

    @Override
    protected Optional<Meeting> findById(int id, PreparedStatement st) throws SQLException {
        st.setInt(1, id);
        try (final ResultSet rs = st.executeQuery()) {
            if (rs.next()) {
                return Optional.of(Meeting.builder()
                        .id(rs.getInt("id"))
                        .place(rs.getString("place"))
                        .desc(rs.getString("description"))
                        .time(rs.getTimestamp("start_time").toLocalDateTime())
                        .build());
            }
            return Optional.empty();
        }
    }
}
