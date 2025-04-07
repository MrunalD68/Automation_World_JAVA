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
/*Explanation
        Input
We define a string, for example: "hello world"

Use a HashMap

We create a HashMap<Character, Integer> to store each character and its count.

The key is the character, and the value is the number of times it appears.

Loop Through Characters

Convert the string to a character array using str.toCharArray().

For each character c:

If c is a space, skip it.

If c already exists in the map, increment its count.

        Otherwise, add c with count 1.

Output the Results

We loop through the map and print each character and its frequency.*/

