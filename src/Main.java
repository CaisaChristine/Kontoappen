import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();

        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("Welcome to the Bank");
            System.out.println("1. Create Account");
            System.out.println("2. Search Account");
            System.out.println("3. List existing accounts");
            System.out.println("4. Make a Deposit");
            System.out.println("5. Make a Withdrawal");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String owner = input.nextLine();
                System.out.print("Starting Balance: ");
                double initialBalance = input.nextDouble();
                register.createAccount(owner, initialBalance);
                System.out.println("Account created successfully!");
            } else if (choice == 2) {
                System.out.println("Account owner: ");
                String owner = input.nextLine();
                Account found = register.findAccount(owner);
                if (found != null) {
                    System.out.println("Account balance: " + found.getBalance());
                } else  {
                    System.out.println("Account not found: " + owner);
                }
            } else if (choice == 3) {
                register.printAll();
            } else if (choice == 4) {
                System.out.print("Enter Name: ");
                String owner = input.nextLine();
                Account found = register.findAccount(owner);
                if  (found != null) {
                    System.out.println("Amount to deposit: ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    found.deposit(amount);
                    System.out.println("New amount: " + found.getBalance());
                } else {
                    System.out.println("Account not found: " + owner);
                }
            } else if (choice == 5) {
                System.out.print("Enter Name: ");
                String owner = input.nextLine();
                Account found = register.findAccount(owner);
                if (found != null) {
                    System.out.println("Amount to withdraw: ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    if (amount <= found.getBalance()) {
                        found.withdraw(amount);
                        System.out.println("New amount: " + found.getBalance());
                    }  else {
                        System.out.println("Insufficient funds! Available amount: " + found.getBalance());
                    }
                } else {
                    System.out.println("Account not found: " + owner);
                }
            } else if (choice == 6) {
                System.out.println("Good Bye!");
            }
        }
    }
}