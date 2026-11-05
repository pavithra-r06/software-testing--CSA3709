import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReverseNumberTest {
    int reverse(int n) {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev * sign;
    }

    @Test void normalNumber() { assertEquals(4321, reverse(1234)); }
    @Test void trailingZero() { assertEquals(21, reverse(1200)); }
    @Test void negativeNumber() { assertEquals(-321, reverse(-123)); }
    @Test void zero() { assertEquals(0, reverse(0)); }
}
