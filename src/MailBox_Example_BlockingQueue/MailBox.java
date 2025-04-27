package MailBox_Example_BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MailBox {

    BlockingQueue<Integer> mail = new LinkedBlockingQueue<>(1);

    public void produce(int value){

        try {
            mail.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int consume(){

        try {
            int value = mail.take();
            return value;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }

    }
}
