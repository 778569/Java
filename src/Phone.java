public class Phone {

//    String name1;
//    String name2;
//    String name3;

    String name;

    public void call(){
        System.out.println("Take a call from " + name);
    }

    public static void main(String[] args) {
//        Phone phone = new Phone();
//        phone.name1="apple";
//        phone.name2="Samsung";
//        phone.name3="nokia";
//        phone.call(phone.name1);
//        phone.call(phone.name2);
//        phone.call(phone.name3);

        Phone phone1= new Phone();
        Phone phone2= new Phone();
        Phone phone3 = new Phone();

        phone1.name ="Apple";
        phone2.name ="Samsun";
        phone3.name ="Nokia";

        phone1.call();
        phone2.call();
    }
}
