// Banking - Negative Test Case
class BankingNegativeTest {
    public static void main(String[] args) {
        double balance = 10000;
        double transferAmount = 15000;

        if (transferAmount > balance) {
            System.out.println("Transaction Rejected");
            System.out.println("Reason: Insufficient Balance");
        } else {
            balance -= transferAmount;
            System.out.println("Transfer Successful");
        }
    }
}
