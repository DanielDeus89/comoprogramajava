package cap03.account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        myAccount.setName("Eduardo");

        System.out.printf("Initial name is: %s%n", myAccount.getName());

        System.out.println("Please Enter the name: ");
        String name = input.nextLine();
        myAccount.setName(name);

        System.out.println(" ");

        System.out.printf("Name in object myAccount is: %s%n", myAccount.getName());

    }
}
