package Homeworkwk2;

/** 1.1 Declare two instance variables.
 * Declare one instance method
 * call both instance variables into the instance method inside the print statement.
 * Declare the main method.
 * call the above instance method into the main method and Run the programme.
 */

public class Programe1 {
    int a = 20;
    String Name= "James bond";

    public void  myMethod1() {

        Programe1 obj = new Programe1();
        System.out.println(obj.a) ;
        System.out.println(Name);
    }


    public static void main(String[] args) {
        Programe1 obj = new Programe1();
        obj.myMethod1();



    }









}
