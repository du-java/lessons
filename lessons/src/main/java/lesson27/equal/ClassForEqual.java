package lesson27.equal;

import lombok.Data;

@Data
public class ClassForEqual {
    private final int id;

    @Equal(value = CompareBy.REFERENCE)
    private final String byReference;

    @Equal
    private final String byValue;
}
