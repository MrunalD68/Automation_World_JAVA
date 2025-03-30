
//How do you remove white spaces from the beginning and end of a string?


package JavaPracticeProgram;

public class RemoveSpeces {
    public static void main(String[] args) {
        String str = "     Hello, Good Morning    ";
        System.out.println("Before Trim: [" +str + "]");

        // Removing leading and trailing spaces

        String trimmedstr = str.trim();
        System.out.println("After trim: [" + trimmedstr + "]");



        //If you want to remove all white spaces (including between words), use:

        String noSpaces = str.replaceAll("\\s+", "");
        System.out.println(" After Remove all speces: [" + noSpaces + "]");
    }
}
