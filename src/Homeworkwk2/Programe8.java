package Homeworkwk2;

import java.util.Scanner;

/**Write a program to calculate the area of a triangle.
**/
public class Programe8 {
    /**Write a program to calculate the area of a triangle.
     */


    float base, height;
    public void triangle(){


float f= (base*height)/2;
    System.out.println("Area of a Triangle = " + f);

}

    public static void main(String[] args) {
        Programe8 p8 = new Programe8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Base :");
        p8.base = sc.nextFloat();
        System.out.println("Enter value of Height :");
        p8.height = sc.nextFloat();

        p8.triangle();

    }
    }