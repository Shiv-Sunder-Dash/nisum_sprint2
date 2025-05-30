import java.util.*;
import java.util.stream.*;

class EmployeeQ3 {
    private String firstName;
    private String lastName;

    public EmployeeQ3(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Map<String, List<EmployeeQ3>> map = new HashMap<>();
        map.put("IT", Arrays.asList(
            new EmployeeQ3("Amit", "Sharma"),
            new EmployeeQ3("Neha", "Kumari")
        ));
        map.put("HR", Arrays.asList(
            new EmployeeQ3("Anjali", "Verma"),
            new EmployeeQ3("Ravi", "Kumar")
        ));

        String search = "ra";

        List<EmployeeQ3> result = map.values().stream()
            .flatMap(List::stream)
            .filter(e -> e.getFirstName().toLowerCase().contains(search) || e.getLastName().toLowerCase().contains(search))
            .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}

