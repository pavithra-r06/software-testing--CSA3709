import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaximumTest {
    int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    @Test void firstIsMaximum() { assertEquals(9, maxOfThree(9, 4, 2)); }
    @Test void secondIsMaximum() { assertEquals(10, maxOfThree(3, 10, 5)); }
    @Test void thirdIsMaximum() { assertEquals(8, maxOfThree(1, 2, 8)); }
    @Test void allEqual() { assertEquals(5, maxOfThree(5, 5, 5)); }
}
