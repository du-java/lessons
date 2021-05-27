package by.du.repository;

import by.du.exception.DbException;
import by.du.model.Meeting;
import by.du.util.DbConn;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
public class MeetingDao implements Dao<Meeting> {

    private static final String SELECT_BY_ID = "select * from todo where id = ?";
    private static final String SELECT_ALL = "select * from todo";

    @Override
    public Optional<Meeting> findById(int id) {
        final Connection connection = DbConn.INSTANCE.getConnection();
        try (final PreparedStatement st = connection.prepareStatement(SELECT_BY_ID)) {
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
        } catch (SQLException ex) {
            log.error("Error finding event", ex);
            throw new DbException(ex);
        }
    }

    @Override
    public List<Meeting> findAll() {
        final Connection connection = DbConn.INSTANCE.getConnection();
        try (final PreparedStatement st = connection.prepareStatement(SELECT_ALL)) {
            try (final ResultSet rs = st.executeQuery()) {
                final ArrayList<Meeting> meetings = new ArrayList<>();
                while (rs.next()) {
                    meetings.add(Meeting.builder()
                            .id(rs.getInt("id"))
                            .place(rs.getString("place"))
                            .desc(rs.getString("description"))
                            .time(rs.getTimestamp("start_time").toLocalDateTime())
                            .build());
                }
                return meetings;
            }
        } catch (SQLException ex) {
            log.error("Error finding all events", ex);
            throw new DbException(ex);
        }
    }
}
