
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q20_filter_numbers_divisible {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 6, 8, 9, 10, 12, 15, 18, 20);

        Predicate<Integer> divisibleBy2 = n -> n % 2 == 0;
        Predicate<Integer> divisibleBy3 = n -> n % 3 == 0;

        List<Integer> divisibleByBoth = numbers.stream()
                .filter(divisibleBy2.and(divisibleBy3))
                .collect(Collectors.toList());

        List<Integer> divisibleByEither = numbers.stream()
                .filter(divisibleBy2.or(divisibleBy3))
                .collect(Collectors.toList());

        System.out.println("Divisible by both 2 and 3: " + divisibleByBoth);
        System.out.println("Divisible by either 2 or 3: " + divisibleByEither);
    }
}
