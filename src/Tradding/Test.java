package Tradding;

class A implements Runnable{
    public void run(){
        System.out.println("Hello");
    }
}


class B extends Thread{
    public void run(){
        System.out.println("Bye");
    }
}


public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        Thread o = new Thread(obj1);
        o.start();

        B obj2 = new B();
        obj2.start();
    }

}
