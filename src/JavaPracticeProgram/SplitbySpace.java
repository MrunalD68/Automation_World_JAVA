//Split by Space

package JavaPracticeProgram;

public class SplitbySpace {
    public static void main(String[] args) {
        String Sentence = "Hello Java World";
        String[] words = Sentence.split(" ");
        for(String word:words)
        {
            System.out.println(word);
        }
    }
}
