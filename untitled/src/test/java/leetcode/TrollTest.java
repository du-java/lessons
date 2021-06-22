package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrollTest {
    @Test
    public void FixedTests_1() {
        assertEquals(
                "Ths wbst s fr lsrs LL!",
                Troll.disemvowel("This website is for losers LOL!")
        );
    }

    @Test
    public void FixedTests_2() {
        assertEquals(
                "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read")
        );
    }

    @Test
    public void FixedTests_3() {
        assertEquals(
                "Wht r y,  cmmnst?",
                Troll.disemvowel("What are you, a communist?")
        );
    }
}