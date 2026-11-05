import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EvenOddTest {
    String checkEvenOdd(int n) {
        if (n % 2 == 0) return "Even";
        return "Odd";
    }

    @Test void evenNumber() { assertEquals("Even", checkEvenOdd(8)); }
    @Test void oddNumber() { assertEquals("Odd", checkEvenOdd(7)); }
    @Test void zeroIsEven() { assertEquals("Even", checkEvenOdd(0)); }
    @Test void negativeEven() { assertEquals("Even", checkEvenOdd(-4)); }
}
