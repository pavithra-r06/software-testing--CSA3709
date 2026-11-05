import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumOfDigitsTest {
    int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    @Test void normalNumber() { assertEquals(10, sumDigits(1234)); }
    @Test void zero() { assertEquals(0, sumDigits(0)); }
    @Test void negativeNumber() { assertEquals(6, sumDigits(-123)); }
    @Test void singleDigit() { assertEquals(8, sumDigits(8)); }
}
