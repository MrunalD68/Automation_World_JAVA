//How do you find the length of a string without using len() or built-in functions?


package JavaPracticeProgram;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str =sc.nextLine();
        int count =0;

        // Iterating through the string and counting characters
        for(char ch :str.toCharArray()){
            count++;

        }
        System.out.println("The Length of the string is : "+count);
        sc.close();
    }
}
/*Explanation:

Scanner Input: Takes the string input from the user.
Character Iteration:
Uses .toCharArray() to convert the string into a character array.
Iterates over the array and increments the count for each character.
Output: Displays the total length of the string.*/