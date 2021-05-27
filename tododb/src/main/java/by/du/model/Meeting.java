package by.du.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Meeting implements Event{
    private int id;
    private LocalDateTime time;
    private String desc;
    private String place;
}
