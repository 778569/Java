package Tradding.MuiltiTradding;

class A extends Thread {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            } catch (Exception e){}
        }

    }
}

class C implements Runnable {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Welcome");
            try{
                Thread.sleep(500);
            } catch (Exception e){}
        }

    }
}

class D implements Runnable {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Bye");
            try{
                Thread.sleep(500);
            } catch (Exception e){}
        }

    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Aubowan");
            try{
                Thread.sleep(500);
            } catch (Exception e){}
        }

    }
}


public class Test {
    public static void main(String[] args) {
       A obj1 = new A();
       obj1.start();
        try{
            Thread.sleep(50);
        } catch (Exception e){}
       B obj2 = new B();
       obj2.start();


       C obj3 = new C();
       Thread o1 = new Thread(obj3);
       o1.run();

        D obj4 = new D();
        Thread o2 = new Thread(obj4);
        o2.run();
    }
}
