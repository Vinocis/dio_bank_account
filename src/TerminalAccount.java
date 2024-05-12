import java.util.Scanner;

public class TerminalAccount {
    public static void run(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the agency number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Please enter the agency: ");
        String agency = sc.next();

        System.out.print("Please enter your balance: ");
        float balance = sc.nextFloat();

        System.out.print("Please enter your name: ");
        String clientName = sc.next();

        String formattedMessage =
                String.format("Hello %s, Thanks for open a account with us! Your agency is %s, account number %d and your balance of R$%.2f is already available for withdrawal.",
                        clientName,
                        agency,
                        accountNumber,
                        balance
                );
        System.out.println(formattedMessage);
    }
}
