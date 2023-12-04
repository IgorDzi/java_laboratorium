package lista_6.zadanie_1;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        scanner.close();


        Optional<Integer> wordCount = SentenceStats.countWords(sentence);
        Optional<Integer> charCount = SentenceStats.countCharacters(sentence);

        Map<String, Long> wordOccurrences = SentenceStats.filterAndCountOccurrences(Arrays.stream(sentence.split("\\s+")));
        Map<Character, Long> charOccurrences = SentenceStats.filterAndCountOccurrences(sentence.chars().mapToObj(c -> (char) c));

        System.out.println("\nSentence Statistics:");
        wordCount.ifPresent(count -> System.out.println("Word Count: " + count));
        charCount.ifPresent(count -> System.out.println("Character Count: " + count));

        System.out.println("\nOccurrences of Individual Words:");
        wordOccurrences.forEach((word, count) -> System.out.println(word + ": " + count));

        System.out.println("\nOccurrences of Individual Characters:");
        charOccurrences.forEach((character, count) -> System.out.println(character + ": " + count));
    }
}
