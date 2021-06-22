package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindShortTest {
    @Test
    public void findShort_1() {
        assertEquals(3, FindShort.findShort("bitcoin take over the world maybe who knows perhaps"));
    }

    @Test
    public void findShort_2() {
        assertEquals(3, FindShort.findShort("turns out random test cases are easier than writing out basic ones"));
    }

    @Test
    public void findShort_3() {
        assertEquals(2, FindShort.findShort("Let's travel abroad shall we"));
    }
}