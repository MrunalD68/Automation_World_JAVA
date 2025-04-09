//Convert an int to a String

package JavaPracticeProgram;

public class ConvertIntToString {
    public static void main(String[] args) {
        int number = 123;

        // Method 1: Using String.valueOf()
        String str1= String.valueOf(number);

        // Method 2: Using Integer.toString()
        String str2 = Integer.toString(number);

        // Method 3: Using concatenation
        String str3 = number + "";

        System.out.println("Using Method 1:"+str1);
        System.out.println("Data Type:" +str1.getClass().getName());

        System.out.println("Using Method 2:" +str2);
        System.out.println("Data Type:" +str2.getClass().getName());

        System.out.println("Using Method 3:" +str3);
        System.out.println("Data Type:" +str3.getClass().getName());
    }
}
