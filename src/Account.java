import java.util.Date;

public class Account {

// Stores the account ID.
    private int id = 0;

// Stores the account balance.
    private double balance = 0;

// Stores the annual interest rate shared by all accounts.
    private static double annualInterestRate = 0;

// Stores the date the account was created.
    private Date dateCreated;

// Creates an account with default values.
    public Account() {
        dateCreated = new Date();
    }
// Creates an account with a specified ID & balance.
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
// Returns the account ID.
    public int getId() {
        return id;
    }
// Updates the account ID.
    public void setId(int id) {
        this.id = id;
    }
// Returns the current account balance.
    public double getBalance() {
        return balance;
    }
// Returns the annual interest rate.
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
// Updates the annual interest rate for all accounts
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
// Returns to the date account was made.
    public Date getDateCreated() {
        return dateCreated;
    }
// Calculates and returns the monthly interest rate.
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }
// Calculates and returns the monthly interest earned.
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
// Withdraws specific amount from the account balance.
    public void withdraw(double amount) {
        balance = balance - amount;
    }
// Deposits specific amount into the account.
    public void deposit( double amount){
        balance = balance + amount;
    }
}
