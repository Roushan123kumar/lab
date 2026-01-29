public class Account {
    private double balance;

    public Account(double iBal) {
        if (iBal < 0)
            throw new IllegalArgumentException("Initial balance cannot be negative");
        this.balance = iBal;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Deposit amount must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance)
            throw new IllegalArgumentException("Invalid withdrawal amount");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account acc = new Account(5000);
        System.out.println("Initial Balance: " + acc.getBalance());
        acc.deposit(700);
        System.out.println("Balance after deposit of 700: " + acc.getBalance());
    }
}
