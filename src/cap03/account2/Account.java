package cap03.account2;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;

        if (balance > 0.0){
            this.balance = balance;
        }
    }
    public String getName() {
        return name;
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance += depositAmount;
        }
    }

    public void withdraw(Double withdrawAmount){
        if (withdrawAmount > balance){
            System.out.println("Withdrawal amount exceeded account balance");
        }else {
            balance -= withdrawAmount;
        }
    }
    public double getBalance() {
        return balance;
    }

    public static void displayAccount(Account account) {
        System.out.printf(("%s balance: $%.2f %n"),account.getName(), account.getBalance());
    }
}
