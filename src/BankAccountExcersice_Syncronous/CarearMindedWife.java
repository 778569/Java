package BankAccountExcersice_Syncronous;

public class CarearMindedWife implements Runnable {

    private BankAccount bankAccount;

    public CarearMindedWife(BankAccount bankAccount) {
        super();
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bankAccount.deposit(25000);
            System.out.println(Thread.currentThread().getName() + " " + "Deposited LKR 25000 and banalance is after deposit is: " + bankAccount.getBalance());
        }
    }
}
