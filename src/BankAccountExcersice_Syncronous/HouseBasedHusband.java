package BankAccountExcersice_Syncronous;

public class HouseBasedHusband implements Runnable {

    private BankAccount bankAccount;

    public HouseBasedHusband(BankAccount bankAccount) {
        super();
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bankAccount.withdraw(25000);
            try{
            Thread.sleep(100);
            }catch (InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName() + " " + "Withdraw LKR 25000 and Balance after withdraw is :" + bankAccount.getBalance());
        }
    }
}
