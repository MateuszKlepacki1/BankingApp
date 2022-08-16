import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;
    Scanner scanner = new Scanner(System.in);
    public void createAccount(){
        System.out.println("Provide Your account name ");
        name = scanner.nextLine();
        System.out.println("Provide Your account number ");
        accountNumber = scanner.nextLine();
        System.out.println("Provide Your login ");
        login = scanner.nextLine();
        System.out.println("Provide Your balance account");
        balance = scanner.nextLong();
    }
    public void showAccount(){
        System.out.println("Account name is "+name);
        System.out.println("Account number is "+accountNumber);
        System.out.println("Account login is "+login);
        System.out.println("Account balance is "+balance);
    }
    public void deposit(){
        System.out.println("How much money do you want to deposit");
        long money;
        money = scanner.nextLong();
        balance = money + balance;
    }
    public void withdraw(){
        System.out.println("How much money do you want to withdraw?");
        long cash;
        cash = scanner.nextLong();
                if(cash>balance){
                    System.out.println("You don't have enough money. Choose another value");
                } else if (cash<=balance) {
                    balance = balance - cash;
                }
    }
}
