package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try{
            System.out.println("Enter First number : ");
            a =sc.nextInt();
            System.out.println("Enter Second number : ");
            b=sc.nextInt();
            c=a/b;
            System.out.println("Answer is : " + c);
        }catch(ArithmeticException e){
            System.out.println("Cant Devide by zero");
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter interger Value");
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e);
        } finally {
            System.out.println("Bye");

        }

    }
}
