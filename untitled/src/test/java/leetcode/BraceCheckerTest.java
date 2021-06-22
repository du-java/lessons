package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTest {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid_1() {
        assertTrue(checker.isValid("()"));
    }

    @Test
    public void testValid_2() {
        assertTrue(checker.isValid("()[]"));
    }

    @Test
    public void testValid_3() {
        assertTrue(checker.isValid("{}()[]"));
    }

    @Test
    public void testValid_5() {
        assertTrue(checker.isValid("([{}])"));
    }

    @Test
    public void testValid_4() {
        assertTrue(checker.isValid("(){}[]"));
    }

    @Test
    public void testInvalid_1() {
        assertFalse(checker.isValid("[(])"));
    }

    @Test
    public void testInvalid_2() {
        assertFalse(checker.isValid("{}[(])"));
    }

    @Test
    public void testInvalid_3() {
        assertFalse(checker.isValid("()[(])"));
    }

    @Test
    public void testInvalid_4() {
        assertFalse(checker.isValid("(}"));
    }

    @Test
    public void testInvalid_5() {
        assertFalse(checker.isValid("[({})](]"));
    }

    @Test
    public void testInvalid_6() {
        assertFalse(checker.isValid("[({})]()]"));
    }

    @Test
    public void testInvalid_7() {
        assertFalse(checker.isValid("()("));
    }
}