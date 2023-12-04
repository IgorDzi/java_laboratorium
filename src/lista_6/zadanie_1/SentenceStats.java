package lista_6.zadanie_1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SentenceStats {


    protected static Optional<Integer> countWords(String sentence) {
        return Optional.of((int) Arrays.stream(sentence.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count());
    }

    protected static Optional<Integer> countCharacters(String sentence) {
        return Optional.of((int) sentence.chars()
                .filter(ch -> !Character.isWhitespace(ch))
                .count());
    }

    protected static <T> Map<T, Long> filterAndCountOccurrences(Stream<T> elements) {
        return elements.filter(Objects::nonNull)
                .filter(element -> !element.toString().isEmpty())
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));
    }
}


