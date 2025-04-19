package CheckInterface;

import Encapsulation.Student;

public class Nimal implements IStudent {
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void Run() {
        System.out.println("Running");
    }

    @Override
    public void Drink() {
        System.out.println("Drinking");
    }

    public static void main(String[] args) {

        IStudent student = new Nimal();
        student.Drink();
        student.eat();
        student.Run();
    }
}