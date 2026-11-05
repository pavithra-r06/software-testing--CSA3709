// ARMS Portal - Negative Test Case
class ARMSNegativeTest {
    public static void main(String[] args) {
        String username = "wrong_user";
        String password = "wrong_pass";
        String validUser = "student01";
        String validPassword = "Arms@123";

        if (username.equals(validUser) && password.equals(validPassword))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Username or Password - Access Denied");
    }
}
