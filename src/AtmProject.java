import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
         /*

        ATM program wtih the while loop

        Transactions
        1.Transaction : Balance
        2.Transaction : Withdrawal
        3.Transaction : Deposit
        Exit : q

        */

        Scanner srcInt = new Scanner(System.in);
        int balance = 1000;
        System.out.println("******************************");
        String transactions = "Transactions\n" +
                "1.Transaction : Balance\n" +
                "2.Transaction : Withdrawal\n" +
                "3.Transaction : Deposit\n" +
                "Exit : q";
        System.out.println(transactions);
        System.out.println("******************************");

        while (true) {
            Scanner srcString = new Scanner(System.in);
            System.out.print("Please choose your transaction: ");
            String transaction = srcString.nextLine();
            if (transaction.equals("q")) {
                System.out.println("exiting the program");
                break;
            } else if (transaction.equals("1")) {
                System.out.println("Your balance= " + balance);
            } else if (transaction.equals("2")) {
                System.out.print("Please enter the amount you want to withdraw= ");
                int amountWithdraw = srcInt.nextInt();
                if (amountWithdraw > balance)
                    System.out.println("Your balance is not enough");
                else {
                    balance = balance - amountWithdraw;
                    System.out.println("Your new balance is= " + balance);
                }
            } else if (transaction.equals("3")) {
                System.out.print("Please enter your deposit= ");
                int deposit = srcInt.nextInt();
                balance = balance + deposit;
                System.out.println("Your new balance= " + balance);
            } else System.out.println("İnvalid transaction");

        }
    }
}

