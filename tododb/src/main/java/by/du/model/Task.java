package by.du.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Task implements Event {
    private int id;
    private String desc;
    private Boolean isDone;
    private LocalDate date;
}
