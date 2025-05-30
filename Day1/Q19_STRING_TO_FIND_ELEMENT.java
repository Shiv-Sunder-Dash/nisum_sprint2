import java.util.*;
import java.util.stream.Collectors;

public class Q19_STRING_TO_FIND_ELEMENT {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Alex", "Brian");

        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Names starting with 'A': " + filtered);
    }
}


