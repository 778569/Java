package MailBox_Example_BlockingQueue;

public class Main {
    public static void main(String[] args) {

        MailBox mailBox = new MailBox();
        Runnable producer = new Producer(mailBox);
        Runnable consumer = new Consumer(mailBox);

        Thread producerThread = new Thread(producer,"Producer");
        Thread consumerThread = new Thread(consumer, "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}
