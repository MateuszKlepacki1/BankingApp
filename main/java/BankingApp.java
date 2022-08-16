import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountDetails acc = new AccountDetails();
        System.out.println("Hello in banking aplication. \n Complete Your account information.");
        acc.createAccount ();
        int inputNumber;
        do {
            System.out.println("What do you want to do (choose right number and write it): \n 1. Show your account information, \n 2. Deposit money, \n 3. Withdarw money, \n 4. Exit from banking aplication.");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    acc.showAccount();
                    break;
                case 2:
                    acc.deposit();
                    break;
                case 3:
                    acc.withdraw();
                    break;
            }
        } while (inputNumber != 4);
    }
}

