package Homeworkwk2;
/**Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r).
 */


import java.util.Scanner;

public class Programe6 {
    double PI = 3.14;
    public void method(){
        Scanner sc = new Scanner (System.in);// syntax
        System.out.println("input first number:");
        int num1 = sc.nextInt();//
        Programe6 obj = new Programe6();
        System.out.println("Input second number:");
        int num2 =sc.nextInt();
        System.out.println("Formula of Area A ="+(PI*num1*num2));


    }

    public static void main(String[] args) {
        Programe6 obj = new Programe6();
        obj.method();
    }
}
