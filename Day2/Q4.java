import java.util.*;
import java.util.stream.*;

public class Q4 {
    public static void main(String[] args) {
        List<String> storeIds = Arrays.asList("1", "23", "456", "7890");

        List<String> padded = storeIds.stream()
            .map(id -> String.format("%4s", id).replace(' ', '0'))
            .collect(Collectors.toList());

        padded.forEach(System.out::println);
    }
}

