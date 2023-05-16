package Homeworkwk2;

/** Declare two instance and two static variable.
 * Declare one instance method
 * Declare one static method
 * Call all four instance and static variable into both instance and static method inside the print statement
 * Declare the main method
 * call both instance and static method in to main method and run the program.
 */

public class Programe4 {
    int a =25;
    int b =30;
    static String Name ="shivam";
    static String Name1 ="patel";
    public void myMethodm1(){
        System.out.println("a="+a+",b="+b);
        System.out.println(Name + Name1);

    }
    public static void myMethod2(Programe4 obj){
        System.out.println("a="+obj.a+",b="+obj.b);





        System.out.println(Name);


    }

    public static void main(String[] args) {
        Programe4 obj =new Programe4();
        obj.myMethodm1();
        myMethod2(obj);
    }










}
