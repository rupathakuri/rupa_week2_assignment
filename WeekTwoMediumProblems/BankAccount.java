// Bank Account System
// Q: How do you create methods for deposit and withdrawal that modify the balance, and check if withdrawal exceeds the balance?

class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    // Constructor to initialize the account
    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "12345", 5000);
        BankAccount account2 = new BankAccount("Bob", "67890", 3000);

        account1.deposit(1500);
        account1.withdraw(2000);
        account1.withdraw(7000);

        account2.deposit(1000);
        account2.withdraw(2000);
        account2.withdraw(500);
    }
}
