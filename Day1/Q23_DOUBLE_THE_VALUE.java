import java.util.*;
import java.util.function.Consumer;

public class Q23_DOUBLE_THE_VALUE {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 8, 10);

        Consumer<Integer> doublerAndPrinter = n -> System.out.println(n * 2);

        numbers.forEach(doublerAndPrinter);
    }
}

