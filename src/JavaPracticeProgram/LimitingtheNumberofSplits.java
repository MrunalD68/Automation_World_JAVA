//Limiting the Number of Splits
//You can specify a limit for the number of splits by passing a second argument to .split()


package JavaPracticeProgram;

public class LimitingtheNumberofSplits {
    public static void main(String[] args) {
        String text = "a,b,c,d,e,f";
        // Split only twice
        String[] letters = text.split(",",2);
        for (String result:letters)
        {
            System.out.println(result);
        }
    }
}
