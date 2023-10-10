import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        String holder;
        double initialDeposit, amount;
        char option;
        Account account;

        System.out.print("Enter the account number:");
        number = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter account holder:");
        holder = scan.nextLine();


        System.out.print("Is there a initial deposit(y/n)?");
        option = scan.next().charAt(0);

        if (option == 'y') {
            System.out.print("Enter initial deposit value:");
            initialDeposit = scan.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
           account = new Account(number, holder);
        }

        System.out.println();

        System.out.println("Account data: " + account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        amount = scan.nextDouble();

        account.deposit(amount);

        System.out.println();

        System.out.println("Updated account data: " + account);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amount = scan.nextDouble();

        account.withdraw(amount);

        System.out.println();

        System.out.println("Updated account data: " + account);

        scan.close();

    }
}