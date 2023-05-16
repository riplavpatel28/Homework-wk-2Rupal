package Homeworkwk2;
/** Declare one instance and one static variable
 * Declare one instance method
 * declare one static method
 * call both static and instance variables into the both instance and static method inside print statement
 * declare the main method
 * call both static and instance method into the main method and run the programme
 */

public class Programe3 {
    int a =10;
    static int b = 15;
    public void myMethod1 (){
        System.out.println("a="+a+"b="+b );

    }
   ;
    public static void myMethodm2(Programe3 obj){
        System.out.println("a="+obj.a+"b="+b );
    }

    public static void main(String[] args) {
        Programe3 obj = new Programe3();
        obj.myMethod1();
        myMethodm2(obj);
    }
}
