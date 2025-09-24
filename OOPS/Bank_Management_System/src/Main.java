public class Main {
    public static void main(String[] args) {

        Account myAccount = new BankAccount("BA12345", 1000);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        myAccount.deposit(500);
        myAccount.withdraw(200);

        if (myAccount instanceof BankAccount) {
            BankAccount bankAcc = (BankAccount) myAccount;
            double[] deposits = {100, 300, -50, 200};
            bankAcc.deposit(deposits);  // Overloaded method
        }
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}