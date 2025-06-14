import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q6_FILTERSTRING {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Alice", "Jack", "Bob", "Jill", "Eve");


        Predicate<String> startsWithJ = name -> name.startsWith("J");


        List<String> filteredNames = names.stream()
                .filter(startsWithJ)
                .collect(Collectors.toList());


        System.out.println("Names starting with J: " + filteredNames);
    }
}
