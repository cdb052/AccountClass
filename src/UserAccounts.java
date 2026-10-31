import java.util.Scanner;

public class UserAccounts {
// Stores the eight bank accounts.
    private Account[] accounts = new Account[8];

// Default constructor for UserAccounts.
    public UserAccounts() {
        for (int i = 0; i < 8; i++) {
            accounts[i] = new Account(i, 50);
        }
    }
// Starts the banking program.
    public static void main(String[] args){
// Reads user input
        Scanner input = new Scanner(System.in);
// Creates the eight bank accounts.
        UserAccounts bank = new UserAccounts();
// Keeps program running.
        while (true){
// Ask for account ID.
        System.out.print("Enter id");
        int id = input.nextInt();
// Checks if account ID is valid.
    if (id < 0 || id > 7){
        System.out.println("Invalid ID. Please try again.");
        continue;
            }
// Gets the account matching the entered ID.
    Account selectedAccount = bank.accounts[id];
// Keeps the menu open for the selected account.
    while (true){
// Displays the banking menu.
        System.out.println("\nMain menu");
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
        System.out.println("Enter a choice: ");
        int choice = input.nextInt();
// Option 1: Checks account balance.
    if (choice == 1){
        System.out.printf("Account balance is $%.2f%n ", selectedAccount.getBalance());
                }
// Option 2: Withdraw money.
    else if (choice == 2) {
        System.out.println("Enter an amount to withdraw: $ ");
        double amount = input.nextDouble();
        selectedAccount.withdraw(amount);
                }
// Option 3: Deposit money.
    else if (choice == 3) {
        System.out.println("Enter an amount to deposit: $ ");
        double amount = input.nextDouble();
        selectedAccount.deposit(amount);
                }
// Option 4: Exit the current account menu.
    else if (choice == 4){
        break;
                }
            }
        }
    }
}