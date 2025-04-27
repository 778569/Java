package MailBox_Thread_LifeCycle_Syncronized;

public class MailBox {
    private int mail;
    private boolean available= false;


    public synchronized void produce(int value){
        while (available){
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.mail = value;
        this.available = true;
        notifyAll();
    }

    public synchronized int consume(){
        while (!available){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

        }
        int value = this.mail;
        this.available = false;
        notifyAll();
        return value;
    }
}
