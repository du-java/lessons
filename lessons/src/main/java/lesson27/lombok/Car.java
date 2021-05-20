package lesson27.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(chain = true)
public class Car {
    private String name;
    private int doors;
    private int power;
}
