import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CompoundInterestTest {
    double compoundAmount(double p, double rate, int years) {
        return p * Math.pow(1 + rate / 100, years);
    }
    double compoundInterest(double p, double rate, int years) {
        return compoundAmount(p, rate, years) - p;
    }

    @Test void normalCase() {
        assertEquals(210.0, compoundInterest(1000, 10, 2), 0.01);
    }
    @Test void zeroRate() {
        assertEquals(0.0, compoundInterest(1000, 0, 3), 0.01);
    }
    @Test void zeroYears() {
        assertEquals(0.0, compoundInterest(500, 8, 0), 0.01);
    }
}
