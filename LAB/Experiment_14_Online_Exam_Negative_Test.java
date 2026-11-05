// Online Examination System - Negative Test Case
class OnlineExamNegativeTest {
    public static void main(String[] args) {
        boolean loggedIn = true;
        boolean examActive = false;
        boolean alreadySubmitted = false;

        if (!loggedIn) {
            System.out.println("Please Login");
        } else if (!examActive) {
            System.out.println("Exam Is Not Available");
        } else if (alreadySubmitted) {
            System.out.println("Duplicate Submission Not Allowed");
        } else {
            System.out.println("Exam Can Be Started");
        }
    }
}
