package Homeworkwk2;

import java.util.Scanner;

/**Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
 */

public class Programe19 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Input a string");
        String line = Sc.nextLine();
       // line = line.toLowerCase(Locale.ROOT);

        System.out.println(line.toLowerCase());

    }
}
