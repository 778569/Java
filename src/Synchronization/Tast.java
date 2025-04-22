package Synchronization;
 class Display{

    synchronized void Print(){
        Thread t = Thread.currentThread();
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(t.getName());
            } catch (Exception e){}

        }
    }
}

class Thrd extends Thread{

    Display c;
    public Thrd(Display c){
        this.c = c;
    }

    public void run(){
        c.Print();
    }

}

public class Tast {

    public static void main(String[] args) {
        Display obj = new Display();

        Thrd th = new Thrd(obj);
        Thrd th1 = new Thrd(obj);
        th.start();
        th1.start();

        System.out.println(Thread.currentThread().getName());
    }


}
