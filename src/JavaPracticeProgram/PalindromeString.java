/*Write a Java program to check if an input string is a palindrome
(reads the same forward and backward). Ignore case sensitivity.

Output:
Enter a string: Madam
The string is a palindrome.
 */

package JavaPracticeProgram;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        sc.close();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)){
            System.out.println("The String is a palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }

    }
}