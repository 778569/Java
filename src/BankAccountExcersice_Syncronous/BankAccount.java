package BankAccountExcersice_Syncronous;

public class BankAccount {

    private String accountID;
    private double balance;

    public BankAccount(String accountID, double balance) {
        super();
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    //Read Operations
    public synchronized double getBalance() { // synchronized- implisit lock
        return balance;
    }

    public synchronized void deposit(double amount){
        if(balance >0){
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("The Amount can not be nagetive!");
        }
    }

    public synchronized void withdraw(double amount){
        if(amount >0){
            if(this.balance - amount >=0){
                this.balance -= amount;
            } else{
                throw  new IllegalArgumentException("Insuffient balace!");
            }
        } else{
            throw new IllegalArgumentException("the Amount can not be negative!");
        }
    }
}
