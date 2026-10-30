public class TestAccount {
// Runs the program to test the Account class.
    public static void main(String[] args) {
// Creates account with ID 1122 and $20,000 balance.
        Account myAccount = new Account(1122, 20000);
// Sets the annual interest rate to 4.5%.
        Account.setAnnualInterestRate(4.5);
// Withdraws $2,500 from the account.
        myAccount.withdraw(2500);
// Deposits $3,000 into the account
        myAccount.deposit(3000);
// Displays the account balance after transactions.
        System.out.printf("Account Balance: $%.2f%n" , myAccount.getBalance());
// Displays the monthly interest earned.
        System.out.printf("Monthly Interest: $%.2f%n", myAccount.getMonthlyInterest());
// Displays the date the account was created.
        System.out.printf("Date Created: " + myAccount.getDateCreated());
    }
}
