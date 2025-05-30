import java.util.*;
import java.util.stream.*;

class EmployeeQ10 {
    private int id;
    private String name;

    public EmployeeQ10(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class Q10 {
    public static void main(String[] args) {
        List<EmployeeQ10> allEmployees = Arrays.asList(
            new EmployeeQ10(1, "Amit"),
            new EmployeeQ10(2, "Neha"),
            new EmployeeQ10(3, "Ravi"),
            new EmployeeQ10(4, "Anjali")
        );

        List<Integer> ids = Arrays.asList(2, 4);

        List<EmployeeQ10> result = allEmployees.stream()
            .filter(e -> ids.contains(e.getId()))
            .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}

