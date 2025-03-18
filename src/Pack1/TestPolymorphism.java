package Pack1;

public class TestPolymorphism {

    public void math(){
        System.out.println("Method1");
    }

    public void math(int x){
        System.out.println("Method2");
    }
    public void math(double y){
        System.out.println("Method3");
    }

    public static void main(String[] args) {

        TestPolymorphism test = new TestPolymorphism();
        test.math(5);
        test.math(6.245);
        test.math();
    }
}
