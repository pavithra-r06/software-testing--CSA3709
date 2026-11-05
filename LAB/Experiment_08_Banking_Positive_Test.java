// Banking - Positive Test Case
class BankingPositiveTest {
    public static void main(String[] args) {
        double balance = 10000;
        double transferAmount = 2500;

        if (transferAmount > 0 && transferAmount <= balance) {
            balance -= transferAmount;
            System.out.println("Fund Transfer Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Transfer Failed");
        }
    }
}
