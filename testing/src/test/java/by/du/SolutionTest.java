package by.du;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SolutionTest {

    @Test
    void test_123456() {
        int given = 123456;
        int expected = 162534;
        int result = new Solution().solution(given);

        assertEquals(expected, result, "not equal");
    }

    @Test
    void test_130() {
        int given = 130;
        int expected = 103;
        int result = new Solution().solution(given);

        assertEquals(expected, result, "not equal");
    }

    @Test
    void test_throw() {
        assertThrows(IllegalArgumentException.class, () -> new Solution().test());
    }

}
