package cap03.account2;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue",-7.00);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = scanner.nextDouble();
        account2.deposit(depositAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.print("Enter a draw for account1: ");
        double draw = scanner.nextDouble();
        account1.withdraw(draw);

        System.out.print("Enter a draw for account2: ");
        draw = scanner.nextDouble();
        account2.withdraw(draw);

        Account.displayAccount(account1);
        Account.displayAccount(account2);
    }
}
