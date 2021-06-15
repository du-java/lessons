package by.du;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {

    @Test
    void sum() {
        TestClass testClass = new TestClass();
        int result = testClass.sum(2, 3);
        assertEquals(5, result);
    }

    @Test
    void max() {
        TestClass testClass = new TestClass();
        int result = testClass.max(2, 3);
        assertEquals(3, result);
    }

    @Test
    void testIsEven() {
        TestClass testClass = new TestClass();
        Boolean result = testClass.doIt(2);
        assertTrue(result);
    }

    @Test
    void testIsOdd() {
        TestClass testClass = new TestClass();
        Boolean result = testClass.doIt(3);
        assertFalse(result);
    }

    @Test
    void testIsZero() {
        TestClass testClass = new TestClass();
        assertThrows(IllegalArgumentException.class, () -> testClass.doIt(0));
    }
}