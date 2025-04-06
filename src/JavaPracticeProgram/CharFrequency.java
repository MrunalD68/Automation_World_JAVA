//Write a Java program to count the occurrence of each character in a string.

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "hello world";

        // Call the method to count character frequency
        countCharacterFrequency(input);
    }

    public static void countCharacterFrequency(String str) {
        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to a char array
        for (char c : str.toCharArray()) {
            // Ignore spaces
            if (c == ' ') continue;

            // If character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If not, add it to the map with count 1
                charCountMap.put(c, 1);
            }
        }

        // Display the result
        System.out.println("Character frequency:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
