package Homeworkwk2;
/** Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.)
*/
public class Programe5 {
 public void addition(int a,int b){
 int ans =a+b;
 System.out.println("addition of two number"+a+ "and" +b+"=" + ans);
 // Programe5 obj =new Programe5()

 }
 public void substraction(int a,int b){
     int ans = a-b;
     System.out.println("Substraction of two number"+a+" and" +b+" ="+ ans);

 }
 public static void division(int a,int b){
     int ans = a/b;
     System.out.println("Division of two number"+a+" and "+b+"="+ans);

 }
public static void Multiplication (int a, int b){
     int ans =a*b;
     System.out.println("Multiplication of two number"+a+" and" +b+" ="+ ans);
}

    public static void main(String[] args) {
        Programe5 obj =new Programe5();
        obj.addition(40,30);
        obj.substraction(40,30);
        division(40,30);
        Multiplication(40,30);
    }

}
