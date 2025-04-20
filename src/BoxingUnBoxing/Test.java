package BoxingUnBoxing;

public class Test {

//    Primitive Type - byte,short,int,long,double,float,char,boolean
//    Non-Primitive Type- String, Array, Map

    public static void main(String[] args) {
        int x = 12;
        Integer y = Integer.valueOf(x); // Boxing // Wrapping
        Integer z= x;

        Integer a = 3;
        int b = a.intValue();//Unboxing,unwrapping
        int c = a;// auto Unboxing

        Integer l = 10;
        int m = l; // auto Unboxing


    }
}
