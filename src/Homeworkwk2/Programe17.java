package Homeworkwk2;

import java.util.Scanner;

/**Write a Java program to convert a decimal number to binary number.

 Input Data:
 Input a Decimal Number : 5
 Expected Output

 Binary number is: 101
 */
public class Programe17 {


        ;

        int a = 5;
        public void insMethod () {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a decimal number ");
            int a   = in.nextInt();
            System.out.println("Binary number is = " + Integer.toBinaryString(a));
        }

    public static void main(String[] args) {
            Programe17 obj = new Programe17();
            obj.insMethod();

    }

    }
