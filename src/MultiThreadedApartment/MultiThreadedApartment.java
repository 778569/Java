package MultiThreadedApartment;

public class MultiThreadedApartment {
    public static void main(String[] args) {
        System.out.println("Name of the default Thread is " + Thread.currentThread().getName());

        //Using Thread Class
        Thread t1 = new MyThread("Tr 01");
        t1.start();

        //Using Runnable Interface
        Runnable r1 = new MyThread_02();
        Thread t2 = new Thread(r1,"Tr 02");
        t2.start();


        for (int i =0; i <10; i++){
            System.out.println(Thread.currentThread().getName()+ " : " + i);
        }
    }
}
