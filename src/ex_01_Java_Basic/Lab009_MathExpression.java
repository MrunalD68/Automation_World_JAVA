package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab009_MathExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of X:");
        double x= sc.nextDouble();

        System.out.println("Enter the value of Y:");
        double y = sc.nextDouble();

        System.out.println("Enter the value of Z:");
        double z = sc.nextDouble();

        sc.close();
        double result = Math.cbrt(Math.pow(x,2)+ Math.pow(y,2)- Math.abs(z));
        System.out.println("Result : " + result);
    }
}
