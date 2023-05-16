package Homeworkwk2;

/** Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;
public class Program7 {
    float D;
    public void instMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input temperature:");
        D = sc.nextFloat();
        System.out.println("Temperature in a Degree celsius = "+ ((D -32)*5/9));
    }

public static void main (String[] args){
        Program7 obj =new Program7();
        obj.instMethod();
}
}
