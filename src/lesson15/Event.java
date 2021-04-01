package lesson15;

import java.time.LocalDateTime;

public class Event implements Todo {

    private String name;
    private String place;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isBusy;

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", isBusy=" + isBusy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (isBusy != event.isBusy) return false;
        if (name != null ? !name.equals(event.name) : event.name != null) return false;
        if (place != null ? !place.equals(event.place) : event.place != null) return false;
        if (startTime != null ? !startTime.equals(event.startTime) : event.startTime != null) return false;
        return endTime != null ? endTime.equals(event.endTime) : event.endTime == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (isBusy ? 1 : 0);
        return result;
    }

    public Event(String name, String place, LocalDateTime startTime, LocalDateTime endTime, boolean isBusy) {
        this.name = name;
        this.place = place;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isBusy = isBusy;
    }

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }
}
