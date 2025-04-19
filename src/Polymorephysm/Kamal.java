package Polymorephysm;

public class Kamal extends Nimal {
    @Override
    public void run() {
        System.out.println("Nimal Running");
    }

    public void eat(){
        System.out.println("Nimal eating");
    }

    public static void main(String[] args) {
        Kamal kamal = new Kamal();
        kamal.run();
        kamal.eat();

        Piyal piyal = new Piyal();
        piyal.run();
    }
}
