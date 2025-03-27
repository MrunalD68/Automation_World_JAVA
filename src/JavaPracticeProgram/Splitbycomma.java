//How do you split a string by a delimiter (e.g., comma, space)?

package JavaPracticeProgram;

public class Splitbycomma {
    public static void main(String[] args) {
        String text = "apple,banana,Orange";
        String[] fruits = text.split(",");
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}
