import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q5_FilterStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("JSHIVA", "SUNDER", "JDASh", "SUSMITA", "JYASHU", "PRASUN");


        Predicate<String> startsWithJ = name -> name.startsWith("J");


        List<String> filteredNames = names.stream()
                .filter(startsWithJ)
                .collect(Collectors.toList());


        System.out.println("Names starting with J: " + filteredNames);
    }
}
