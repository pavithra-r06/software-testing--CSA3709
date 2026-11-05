// Online Examination System - Positive Test Case
class OnlineExamPositiveTest {
    public static void main(String[] args) {
        boolean studentLoggedIn = true;
        boolean examAvailable = true;
        int totalQuestions = 20;
        int answeredQuestions = 18;

        if (studentLoggedIn && examAvailable) {
            System.out.println("Exam Started");
            System.out.println("Questions: " + totalQuestions);
            System.out.println("Answers Saved: " + answeredQuestions);
            System.out.println("Exam Submitted Successfully");
        } else {
            System.out.println("Exam Access Denied");
        }
    }
}
