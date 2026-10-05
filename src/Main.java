import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("Welcome to the Bank");
            System.out.println("1. Create Account");
            System.out.println("2. List Accounts");
            System.out.println("3. Make a Deposit");
            System.out.println("4. Make a Withdrawal");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = input.nextInt();
            input.nextLine();
        }
    }
}