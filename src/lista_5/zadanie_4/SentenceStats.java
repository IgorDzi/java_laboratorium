package lista_5.zadanie_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SentenceStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        scanner.close();

        // Counting the total number of words and characters
        int wordCount = sentence.split("\\s+").length;
        int charCount = sentence.length();

        // Counting occurrences of individual words
        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordOccurrences = new HashMap<>();
        for (String word : words) {
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
        }

        // Counting occurrences of individual characters
        Map<Character, Integer> charOccurrences = new HashMap<>();
        for (char character : sentence.toCharArray()) {
            charOccurrences.put(character, charOccurrences.getOrDefault(character, 0) + 1);
        }

        // Displaying statistics
        System.out.println("\nSentence Statistics:");
        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count: " + charCount);

        System.out.println("\nOccurrences of Individual Words:");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nOccurrences of Individual Characters:");
        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

