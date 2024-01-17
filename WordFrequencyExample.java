import java.util.HashMap;
import java.util.Map;

public class WordFrequencyExample {
    public static void main(String[] args) {
        String inputStr = "apple;banana;orange;apple;banana;grape;apple";

        // Split the string into an array of words separated by semicolon
        String[] wordsArray = inputStr.split(";");

        // Calculate word frequencies using a Map
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : wordsArray) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Find the word with the highest frequency
        String highestFreqWord = "";
        int highestFreq = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > highestFreq) {
                highestFreq = entry.getValue();
                highestFreqWord = entry.getKey();
            }
        }

        // Print the result
        System.out.println("Word frequencies: " + wordFrequencyMap);
        System.out.println("Word with the highest frequency: " + highestFreqWord + " (Frequency: " + highestFreq + ")");
    }
}
/*
 * 
 * 
 * 
 without using .put() function

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyExample {
    public static void main(String[] args) {
        String inputStr = "apple;banana;orange;apple;banana;grape;apple";

        // Split the string into an array of words separated by semicolon
        String[] wordsArray = inputStr.split(";");

        // Calculate word frequencies using a Map
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : wordsArray) {
            // Check if the word is already in the map
            if (wordFrequencyMap.containsKey(word)) {
                // If yes, increment the frequency
                wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
            } else {
                // If no, add the word to the map with frequency 1
                wordFrequencyMap.put(word, 1);
            }
        }

        // Find the word with the highest frequency
        String highestFreqWord = "";
        int highestFreq = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > highestFreq) {
                highestFreq = entry.getValue();
                highestFreqWord = entry.getKey();
            }
        }

        // Print the result
        System.out.println("Word frequencies: " + wordFrequencyMap);
        System.out.println("Word with the highest frequency: " + highestFreqWord + " (Frequency: " + highestFreq + ")");
    }
}

 * 
 */