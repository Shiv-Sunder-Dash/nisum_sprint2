import java.util.*;

public class Q17_sort_a_list_of_string {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("banana", "kiwi", "apple", "grape", "pineapple");

        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println("Sorted by length: " + names);
    }
}

