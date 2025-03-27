//Split by Multiple Spaces or Tabs

package JavaPracticeProgram;

public class SplitbyMultipleSpacesorTabs {
    public static void main(String[] args) {
        String text = "Java   is\tawesome";
        String[] words = text.split("\\s+");
        for(String word:words)
        {
            System.out.println(word);
        }
    }
}
