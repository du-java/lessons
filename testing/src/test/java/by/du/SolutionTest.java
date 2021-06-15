package by.du;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test_123456() {
        int given = 123456;
        int expected = 162534;
        int result = Solution.solution(given);

        assertEquals(expected, result, "not equal");
    }

    @Test
    void test_130() {
        int given = 130;
        int expected = 103;
        int result = Solution.solution(given);

        assertEquals(expected, result, "not equal");
    }
}
