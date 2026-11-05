import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class AnagramTest {
    boolean isAnagram(String a, String b) {
        char[] x = a.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] y = b.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    @Test void validAnagram() {
        assertTrue(isAnagram("listen", "silent"));
    }
    @Test void differentWords() {
        assertFalse(isAnagram("hello", "world"));
    }
    @Test void caseAndSpaces() {
        assertTrue(isAnagram("Dormitory", "Dirty room"));
    }
}
