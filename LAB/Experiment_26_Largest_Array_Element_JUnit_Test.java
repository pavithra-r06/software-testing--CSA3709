import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LargestArrayTest {
    int largest(int[] a) {
        if (a == null || a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    @Test void normalArray() { assertEquals(9, largest(new int[]{2, 9, 4, 1})); }
    @Test void negativeArray() { assertEquals(-2, largest(new int[]{-8, -2, -5})); }
    @Test void singleElement() { assertEquals(7, largest(new int[]{7})); }
    @Test void emptyArray() {
        assertThrows(IllegalArgumentException.class, () -> largest(new int[]{}));
    }
}
