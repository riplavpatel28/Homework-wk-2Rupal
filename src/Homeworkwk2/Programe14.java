package Homeworkwk2;

import java.util.Scanner;

/**Write a Java program to print the area and perimeter of a rectangle.

 Test Data:
 Width = 5.5 Height = 8.5

 Expected Output:

 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20

 */

public class Programe14 {
    public void instMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width value");
        Double width = sc.nextDouble();
        System.out.println("Enter height value");
        Double Height = sc.nextDouble();
        Double area =(width*Height);
        Double perimeter = 2*(width+Height);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, Height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", Height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, Height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", Height, width, perimeter);



    }

    public static void main(String[] args) {
        Programe14 obj = new Programe14();
        obj.instMethod();
    }
}
