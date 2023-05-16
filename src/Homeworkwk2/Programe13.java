package Homeworkwk2;

import java.util.Scanner;

/**Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.
 */

public class Programe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int Number1 =scanner.nextInt();
        System.out.println("Enter the second number");
        int Number2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int Number3 =scanner.nextInt();
        float sum = (Number1+Number2+Number3);
        System.out.print( "The Average value is result" + sum/3);
    }











}
