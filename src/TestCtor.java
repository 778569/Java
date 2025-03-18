//Constructor

public class TestCtor {
    String name;

    public TestCtor() {
        name ="Bye";
        System.out.println("Welcome");
    }

    void meth(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        TestCtor obj  = new TestCtor();
        obj.name="Hi";
        System.out.println(obj.name);

    }
}
