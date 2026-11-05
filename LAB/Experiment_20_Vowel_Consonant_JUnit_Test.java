import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VowelConsonantTest {
    int[] countLetters(String s) {
        int vowels = 0, consonants = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    @Test void normalText() {
        assertArrayEquals(new int[]{3, 4}, countLetters("Testing"));
    }
    @Test void mixedCase() {
        assertArrayEquals(new int[]{2, 2}, countLetters("AbCd"));
    }
    @Test void noLetters() {
        assertArrayEquals(new int[]{0, 0}, countLetters("123 !"));
    }
}
