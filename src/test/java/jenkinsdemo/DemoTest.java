package jenkinsdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void add_works() {
        Demo demo = new Demo();
        assertEquals(5, demo.add(2, 3));
        assertEquals(10, demo.add(5, 5));
    }

    @Test
    void isEven_trueForEven_falseForOdd() {
        Demo demo = new Demo();
        assertTrue(demo.isEven(10));
        assertFalse(demo.isEven(11));
    }

    @Test
    void normalizeName_defaultsToDefault() {
        Demo demo = new Demo();
        assertEquals("Default", demo.normalizeName(null));
        assertEquals("Default", demo.normalizeName("   "));
        assertEquals("Adam", demo.normalizeName("  Adam "));
    }
}