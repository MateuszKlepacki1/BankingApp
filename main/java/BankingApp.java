import java.util.Random;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create initial account
        System.out.println("How many number of customers do you want to input?");
        int numberOfNewAccounts = scanner.nextInt();
        AccountDetails tableOfNewClients[] = new AccountDetails[numberOfNewAccounts];
        for (int i = 0; i < tableOfNewClients.length; i++) {
            tableOfNewClients[i] = new AccountDetails();
            tableOfNewClients[i].createAccount();
            tableOfNewClients[i].showAccount();
        }
        //loop runs until number 5 is not pressed to exit
        int inputNumber;
        do {
            System.out.println("\n **Banking System Aplication**");
            System.out.println(" 1. Display all acount details. \n 2. Search by account number. \n 3. Deposit the amount. \n 4. Withdraw the amount. \n 5. Exit.");
            System.out.println("Enter your choise.");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    for (int i = 0; i < tableOfNewClients.length; i++) {
                        tableOfNewClients[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.println("Enter account number you want to search: ");
                    String accountNumber = scanner.next();
                    boolean found = false;
                    for (int i = 0; i < tableOfNewClients.length; i++) {
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist!");
                    }
                    break;
                case 3:
                    System.out.println("Enter account number: ");
                    accountNumber = scanner.next();
                    found = false;
                    for (int i = 0; i<tableOfNewClients.length;i++){
                    found = tableOfNewClients[i].search(accountNumber);
                    if (found) {
                        tableOfNewClients[i].deposit();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search failed! Account doesn't exist.");
                }
                break;
                case 4:
                    System.out.println("Enter account number: ");
                    accountNumber = scanner.next();
                    found = false;
                    for (int i = 0; i < tableOfNewClients.length; i++) {
                        found = tableOfNewClients[i].search(accountNumber);
                        if (found) {
                            tableOfNewClients[i].withdraw();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exists");
                    }
                    break;
                case 5:
                    System.out.println("See you soon!");
                    break;
            }
        }
        while (inputNumber != 4);
    }
}


