public class Test {

    static String name1;
    static  String name2;
    static  String name3;

    static void call1(){
        System.out.println("Take a call from " + name1);
    }
    static void call2(){
        System.out.println("Take a call from " + name2);
    }
    static void call3(){
        System.out.println("Take a call from " + name3);
    }
//    int x =5 ;
//    static int y=6;
//    void meth1(){
//
//    }
//
//    static  void meth2(){
//
//    }

    public static void main(String[] args) {
//        y=5;
//        meth2();
//
//        Test obj = new Test();
//                obj.x=1;
//                obj.meth1();
//                obj.y =3;
name1 = "apple";
name2="nokia";
name3 ="huawei";

call1();
call2();
call3();
    }
}
