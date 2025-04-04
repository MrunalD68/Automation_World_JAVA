//Write a Java program to swap two numbers without using a third variable.


package JavaPracticeProgram;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before Swap:");
        System.out.println(a);
        System.out.println(b);

        // Swapping without third variable

        a=a+b;  // a becomes 15
        b=a-b;  // b becomes 5 (15 - 10)
        a=a-b;  // a becomes 10 (15 - 5)

        System.out.println("After Swap:");
        System.out.println(a);
        System.out.println(b);

    }
}
