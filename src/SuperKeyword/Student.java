package SuperKeyword;

import Pack1.Kamal;

public class Student {

    public String name;
    public int age;
    public String subject;

    public Student(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
}

class Shasi extends Student {

    public int marks;

    public Shasi(String name, int age, String subject, int marks) {
        super(name, age, subject);
        this.marks = marks;
    }
}

class Example {
    public static void main(String[] args) {

        Shasi obj = new Shasi("Kavinda",30,"CDS",98);
        System.out.println(obj.marks);
        System.out.println(obj.name);

    }
}
