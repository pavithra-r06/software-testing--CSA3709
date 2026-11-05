// ATM System - Defect/Validation Test
class ATMTest {
    public static void main(String[] args) {
        int balance = 5000;
        int pin = 1234;
        int enteredPin = 1111;

        if (enteredPin != pin) {
            System.out.println("Invalid PIN - Access Denied");
        } else {
            int amount = 1000;
            if (amount <= 0)
                System.out.println("Invalid amount");
            else if (amount > balance)
                System.out.println("Insufficient balance");
            else
                System.out.println("Cash Withdrawal Successful");
        }
    }
}
