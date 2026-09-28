class Account {
    private double balance;
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
    public double getBalance() { return balance; }
}
public class BankAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(5000);
        account.withdraw(1200);
        System.out.println("Balance: " + account.getBalance());
    }
}
