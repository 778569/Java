package MailBox_Example_BlockingQueue;

public class Consumer implements Runnable {

    private MailBox mailBox;

    public Consumer(MailBox mailBox) {
        this.mailBox = mailBox;
    }

    @Override
    public void run() {

        while (true){

            int value = mailBox.consume();
            System.out.println(Thread.currentThread().getName()+ " consumes "+ value);
            if(value ==9){
                break;
            }
        }

    }
}
