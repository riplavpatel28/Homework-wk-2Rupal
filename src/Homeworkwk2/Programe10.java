package Homeworkwk2;

import java.util.Scanner;

/**Write a Java program that takes a number as input and prints its
 multiplication table up to 10.
 Test Data: Input a number: 8
 Expected Output :
 8 x 1 = 8
 8 x 2 = 16
 8 x 3 = 24
 8 x 10 = 80
 *
 */

public class Programe10 {
    public void table(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number = ");
        int a = sc.nextInt();
        int i = 1;


        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i)); i++;
        System.out.println(a+" *  " +i +" = "+(a*i));

    }

    public static void main(String[] args) {
        Programe10 obj =new Programe10();
        obj.table();

    }
}
