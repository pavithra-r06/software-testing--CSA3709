import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeNumberTest {
    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    @Test void primeNumber() { assertTrue(isPrime(13)); }
    @Test void compositeNumber() { assertFalse(isPrime(12)); }
    @Test void oneIsNotPrime() { assertFalse(isPrime(1)); }
    @Test void negativeIsNotPrime() { assertFalse(isPrime(-7)); }
}
