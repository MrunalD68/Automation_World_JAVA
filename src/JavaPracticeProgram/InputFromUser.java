package JavaPracticeProgram;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        //Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //Prompt the user for input
        System.out.println("Enter your First Name:");

        //Read a line of text entered by user
        String name = sc.nextLine();

        //Prompt the user for number
        System.out.println("Enter your age:");

        //Read an integer entered by user
        int age= sc.nextInt();

        //Display the user input
        System.out.println("Hello " +name + "! You are "+ age +" years old.");

        //Close the scanner to release resources(Optional)
        sc.close();



    }
}
