package cap03.account1;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        System.out.printf("Account1 name is: %s%n", account1.getName());
        System.out.printf("Account1 name is: %s%n", account2.getName());
    }
}
