package Homeworkwk2;

import java.util.Scanner;

public class Programe9 {
    /**Write a program to convert the upper case to lower case.
     */
    public void intsMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Uppercase");
        String str =sc.nextLine();
        System.out.println(str.toLowerCase());

    }

    public static void main(String[] args) {
        Programe9 obj =new Programe9();
        obj.intsMethod();
    }
}
