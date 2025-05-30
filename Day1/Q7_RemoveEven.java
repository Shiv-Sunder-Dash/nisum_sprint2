import java.util.*;
import java.util.function.Predicate;

public class Q7_RemoveEven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 22, 33, 40, 51));


        Predicate<Integer> isEven = num -> num % 2 == 0;


        numbers.removeIf(isEven);


        System.out.println("List after removing even numbers: " + numbers);
    }
}


