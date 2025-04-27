package MailBox_Example_Reentrant_Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MailBox {
    private int mail;
    private boolean avalability= false;

ReentrantLock lock = new ReentrantLock();

Condition available =  lock.newCondition();
Condition notAvailable = lock.newCondition();

    public void produce(int value){
        try{
            lock.lock();
            while (avalability){
                try {
                    available.await();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                this.mail = value;
                this.avalability = true;
                notAvailable.signalAll();
            }
        }finally {
            lock.unlock();
        }
    }

    public int consume(){
        try{
            lock.lock();

            while (!avalability){
                try {
                    notAvailable.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            int value = this.mail;
            this.avalability = false;
            available.signalAll();
            return value;
        }finally {
        lock.unlock();
        }


    }
}
