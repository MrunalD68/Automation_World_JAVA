package JavaPracticeProgram;

public class LengthOfStringWithout {
    public static void main(String[] args) {
        String str = "Mrunal";
        int count = 0;

        for(int i= 0; str.length()>i; i++)
        {
            count++;

        }
        System.out.println("The Length of the string is " +count);
    }
}
