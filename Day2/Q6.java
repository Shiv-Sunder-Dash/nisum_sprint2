import java.util.*;
import java.util.stream.*;

class EmployeeQ6 {
    private String firstName;
    private String lastName;

    public EmployeeQ6(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Q6 {
    public static void main(String[] args) {
        List<EmployeeQ6> employees = Arrays.asList(
            new EmployeeQ6("Neha", "Verma"),
            new EmployeeQ6("Amit", "Sharma"),
            new EmployeeQ6("Ravi", "Kumar")
        );

        List<EmployeeQ6> sorted = employees.stream()
            .sorted(Comparator.comparing(EmployeeQ6::getFirstName))
            .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}

