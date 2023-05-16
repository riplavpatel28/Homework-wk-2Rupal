package Homeworkwk2;

import java.util.Scanner;

/**Write a Java program to print the sum (addition), multiply, subtract, divide and
 remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5
 */

public class Programe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter Second number");
        int number2 = sc.nextInt();
        System.out.println(number1 + "+" + number2 + "=" +(number1 + number2));
        System.out.println(number1 + "-" + number2 + "=" +(number1 - number2));
        System.out.println(number1 + "*" + number2 + "=" +(number1 * number2));
        System.out.println(number1 + "/" + number2 + "=" +(number1 / number2));
        System.out.println(number1 +"mod"+ number2 + "=" +(number1 % number2));
    }









}
