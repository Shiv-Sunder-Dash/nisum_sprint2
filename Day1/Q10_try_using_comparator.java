import java.util.*;

public class Q10_try_using_comparator {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape", "pineapple");


        words.sort(Comparator.comparingInt(String::length));


        System.out.println("Sorted by length: " + words);
    }
}
