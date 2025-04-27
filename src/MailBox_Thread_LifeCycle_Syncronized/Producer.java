package MailBox_Thread_LifeCycle_Syncronized;

public class Producer implements Runnable{

    private MailBox mailBox;

    public Producer(MailBox mailBox) {
        this.mailBox = mailBox;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            mailBox.produce(i);
            System.out.println(Thread.currentThread().getName()+" produced " + i);
        }

    }
}
