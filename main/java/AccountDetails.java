import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;
    Scanner scanner = new Scanner(System.in);

    // method to open new account
    public void createAccount() {
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter account number: ");
        accountNumber = scanner.nextLine();
        System.out.println("Enter login:  ");
        login = scanner.nextLine();
        System.out.println("Enter balance: ");
        balance = scanner.nextLong();
    }

    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder is " + name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account login: " + login);
        System.out.println("Account balance: " + balance);
    }

    // method to deposit money
    public void deposit() {
        System.out.println("How much money do you want to deposit");
        long money;
        money = scanner.nextLong();
        balance = money + balance;
    }

    // method to withdraw money
    public void withdraw() {
        System.out.println("How much money do you want to withdraw?");
        long cash;
        cash = scanner.nextLong();
        if (cash > balance) {
            System.out.println("You don't have enough money. Choose another value");
        } else if (cash <= balance) {
            balance = balance - cash;
        }
    }

    // method to search an account number
    public boolean search(String accountNumber) {
        if (accountNumber.equals(accountNumber)) {
            showAccount();
            return (true);
        }
        return(false);
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
            this.accountNumber=accountNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLogin(){
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public int multiply(int x, int y){
        return x*y;
    }
}
