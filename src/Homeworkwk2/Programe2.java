package Homeworkwk2;

/** Declare two static variables
 * declare one static method
 * Call both static variables into the static method inside the printstatement.
 * Declare the main method.
 * call the static method into the main method and run the programme.

 */

public class Programe2 {
    static int a =20;
    static  int b =15;
    public static void myMethod(){
        System.out.println("a="+a+",b="+b);
    }

    public static void main(String[] args) {
        Programe2.myMethod();

    }
}

