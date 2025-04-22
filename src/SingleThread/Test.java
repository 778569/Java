package SingleThread;

public class Test {
// Sequential program bcz there is only one thread
    private static String name = null;

    public static void main(String[] args) {
        System.out.println("Name of the default Thread is " + Thread.currentThread().getName());

        for (int i =0; i <10; i++){
            System.out.println(Thread.currentThread().getName()+" : " + i);
        }

        System.out.println(name.toString());
    }
}
