//Write a Java program to reverse a string  using built-in functions.

package JavaPracticeProgram;

import java.util.Scanner;

public class ReverseStringBuiltinFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        sc.close();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String is : " +reversed);
    }

}
