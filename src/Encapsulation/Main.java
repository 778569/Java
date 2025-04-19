package Encapsulation;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Kavinda");
        student.setAge(30);

        System.out.printf(student.getName());
//        System.out.printf(student.getAge());
    }
}
