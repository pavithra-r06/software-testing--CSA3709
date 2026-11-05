import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemperatureTest {
    double toFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    @Test void freezingPoint() {
        assertEquals(32.0, toFahrenheit(0), 0.001);
    }
    @Test void boilingPoint() {
        assertEquals(212.0, toFahrenheit(100), 0.001);
    }
    @Test void negativeTemperature() {
        assertEquals(-40.0, toFahrenheit(-40), 0.001);
    }
    @Test void normalTemperature() {
        assertEquals(98.6, toFahrenheit(37), 0.001);
    }
}
