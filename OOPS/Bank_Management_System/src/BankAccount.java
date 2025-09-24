public class BankAccount extends Account {

    public BankAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited " + amount + ". New Balance: " + getBalance());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void deposit(double[] amounts) {
        double total = 0;
        for (double amt : amounts) {
            if (amt > 0) {
                total += amt;
            } else {
                System.out.println("Skipped invalid amount: " + amt);
            }
        }
        setBalance(getBalance() + total);
        System.out.println("Deposited multiple amounts: " + total + ". New Balance: " + getBalance());
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + ". New Balance: " + getBalance());
        }
    }
}