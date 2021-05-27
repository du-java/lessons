package by.du.service;

import by.du.exception.NotFoundException;
import by.du.model.Meeting;
import by.du.repository.Dao;

import java.util.List;

public class MeetingService implements Service<Meeting> {

    private final Dao<Meeting> meetingDao;

    @Override
    public Meeting findById(int id) {
        return meetingDao.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    @Override
    public List<Meeting> findAll() {
        return meetingDao.findAll();
    }

    public MeetingService(Dao<Meeting> meetingDao) {
        this.meetingDao = meetingDao;
    }
}
