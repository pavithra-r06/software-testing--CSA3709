import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IgnoreCaseTest {
    boolean equalsIgnoreCase(String a, String b) {
        if (a == null || b == null) return a == b;
        return a.equalsIgnoreCase(b);
    }

    @Test void sameTextDifferentCase() {
        assertTrue(equalsIgnoreCase("Java", "JAVA"));
    }
    @Test void differentText() {
        assertFalse(equalsIgnoreCase("Java", "Python"));
    }
    @Test void bothNull() {
        assertTrue(equalsIgnoreCase(null, null));
    }
    @Test void oneNull() {
        assertFalse(equalsIgnoreCase("Java", null));
    }
}
