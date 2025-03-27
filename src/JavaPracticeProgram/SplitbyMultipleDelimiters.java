// Split by Multiple Delimiters
//You can split by several delimiters using a regex with the OR symbol (|):

package JavaPracticeProgram;

public class SplitbyMultipleDelimiters {
    public static void main(String[] args) {
        String text = "apple;orange|banana,grape";
        // Split by ; | or ,
        String[] fruits = text.split("[;|,]");
        for(String fruit:fruits)
        {
            System.out.println(fruit);
        }
    }
}
