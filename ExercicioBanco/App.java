import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        String holder;
        double balance, amount;
        char option;

        System.out.print("Enter the account number:");
        number = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter account holder:");
        holder = scan.nextLine();


        System.out.print("Is there a initial deposit(y/n)?");
        option = scan.next().charAt(0);

        if (option == 'y') {
            System.out.print("Enter initial deposit value:");
            balance = scan.nextDouble();
        } else {
            balance = 0.0;
        }

        Account newAccount = new Account(number, holder, balance);

        System.out.println();

        System.out.println("Account data: " + newAccount);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        amount = scan.nextDouble();

        newAccount.deposit(amount);

        System.out.println();

        System.out.println("Updated account data: " + newAccount);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        amount = scan.nextDouble();

        newAccount.withdraw(amount);

        System.out.println();

        System.out.println("Updated account data: " + newAccount);

        scan.close();

    }
}