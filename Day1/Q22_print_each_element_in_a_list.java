import java.util.*;
import java.util.function.Consumer;

public class Q22_print_each_element_in_a_list {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");

        Consumer<String> printer = item -> System.out.println(item);

        items.forEach(printer);
    }
}

