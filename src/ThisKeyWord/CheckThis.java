package ThisKeyWord;

public class CheckThis {

    public String name;
    public int age;

    public CheckThis(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        CheckThis checkThis = new CheckThis("Kavinda",30);
        System.out.println(checkThis.name);
        System.out.println(checkThis.age);

    }
}
