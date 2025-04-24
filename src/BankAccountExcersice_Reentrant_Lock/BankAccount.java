package BankAccountExcersice_Reentrant_Lock;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    ReentrantLock lock = new ReentrantLock();

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
    public double getBalance() { // synchronized- implisit lock

        try {
            lock.lock();
            return balance;
        } finally {
            lock.unlock();
        }
    }

    public void deposit(double amount){
        try {
            lock.lock();
            if(balance >0){
                this.balance += amount;
            } else {
                throw new IllegalArgumentException("The Amount can not be nagetive!");
            }
        } finally {
            lock.unlock();
        }
    }

    public synchronized void withdraw(double amount){
        try {
            lock.lock();
            if(amount >0){
                if(this.balance - amount >=0){
                    this.balance -= amount;
                } else{
                    throw  new IllegalArgumentException("Insuffient balace!");
                }
            } else{
                throw new IllegalArgumentException("the Amount can not be negative!");
            }
        } finally {
            lock.unlock();
        }

    }
}
