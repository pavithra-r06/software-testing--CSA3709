import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeTest {
    String calculateGrade(int marks) {
        if (marks < 0 || marks > 100) return "Invalid";
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    @Test void gradeA() { assertEquals("A", calculateGrade(95)); }
    @Test void gradeB() { assertEquals("B", calculateGrade(85)); }
    @Test void gradeC() { assertEquals("C", calculateGrade(75)); }
    @Test void gradeD() { assertEquals("D", calculateGrade(65)); }
    @Test void gradeF() { assertEquals("F", calculateGrade(40)); }
    @Test void invalidMarks() { assertEquals("Invalid", calculateGrade(110)); }
}
