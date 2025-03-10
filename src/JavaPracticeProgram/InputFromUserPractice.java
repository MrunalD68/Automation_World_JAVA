/*Write a Java program that takes two integer numbers as input from
 the user and prints their sum, difference, product, and quotient.
 Enter first number: 10
Enter second number: 5
Output:
Sum: 15
Difference: 5
Product: 50
Quotient: 2  */

package JavaPracticeProgram;

import java.util.Scanner;

public class InputFromUserPractice {
    public static void main(String[] args) {
        //Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //Prompt the user for first number
        System.out.println("Enter First Number:");

        int FirstNumber = sc.nextInt();

        //Prompt the user for second number

        System.out.println("Enter Second Number:");
        int SecondNumber= sc.nextInt();

        //Display the user input

        System.out.println("Sum:" + (FirstNumber+SecondNumber));
        System.out.println("Difference:"+(FirstNumber-SecondNumber));
        System.out.println("Product:"  + (FirstNumber*SecondNumber));
        System.out.println("Quotient:"+ (FirstNumber/SecondNumber));



    }




}
