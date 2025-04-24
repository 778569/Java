package BankAccountExcersice_Reentrant_Lock;

import BankAccountExcersice_Syncronous.BankAccount;
import BankAccountExcersice_Syncronous.CarearMindedWife;
import BankAccountExcersice_Syncronous.HouseBasedHusband;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccountExcersice_Syncronous.BankAccount obj = new BankAccount("Acc01",25000);

        Runnable cmw = new CarearMindedWife(obj);
        Runnable hbh = new HouseBasedHusband(obj);

        Thread cmwThread = new Thread(cmw, "Career Minded Wife");
        Thread hbhThread = new Thread(hbh,"House Base Husband");

        cmwThread.start();
        hbhThread.start();

    }

}
