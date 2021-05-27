package lesson28;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
}
