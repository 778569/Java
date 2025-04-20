package Generics;

class A<T>{
    public void Print(T x){
        T y = (T) x;
        System.out.println(y);
    }
}

class Test1<T>{

    T[] arr = (T[])new Object[3];

    public void Print(){


            System.out.println(arr);

    }
}
public class Test {

    public static void main(String[] args) {

        A<Integer> obj1 = new A();
        obj1.Print(50);

        Test1<Integer> obj = new Test1();

//        int a = obj.arr[0];

        obj.arr[0] = 10;
        obj.arr[1] = 15;

        obj.Print();
//

    }
}


