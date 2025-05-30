import java.util.*;
import java.util.function.Consumer;

public class Q8_UppercasePrinter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");


        Consumer<List<String>> printUppercase = list -> {
            for (String name : list) {
                System.out.println(name.toUpperCase());
            }
        };


        printUppercase.accept(names);
    }
}
