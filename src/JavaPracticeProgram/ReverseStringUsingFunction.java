
//Write a Java program to reverse a string without using built-in functions.


package JavaPracticeProgram;

import java.util.Scanner;

public class ReverseStringUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        sc.close();
        String reversed = reverseString(input);
        System.out.println("Reversed String is : " + reversed);

    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left=0,right=charArray.length-1;
        while(left<right)
        {
            char temp =charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);

    }
}
