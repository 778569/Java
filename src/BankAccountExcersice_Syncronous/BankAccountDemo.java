package BankAccountExcersice_Syncronous;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Acc01",25000);

        Runnable cmw = new CarearMindedWife(obj);
        Runnable hbh = new HouseBasedHusband(obj);

        Thread cmwThread = new Thread(cmw, "Career Minded Wife");
        Thread hbhThread = new Thread(hbh,"House Base Husband");

        cmwThread.start();
        hbhThread.start();

    }
}
