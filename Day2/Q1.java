import java.util.*;

class EmployeeQ1 {
    private String firstName;
    private String lastName;

    public EmployeeQ1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class Q1 {
    public static void main(String[] args) {
        List<EmployeeQ1> employees = Arrays.asList(
            new EmployeeQ1("Amit", "Sharma"),
            new EmployeeQ1("Neha", "Verma"),
            new EmployeeQ1("Ravi", "Kumar")
        );

        String fullName = employees.stream()
            .findFirst()
            .map(e -> e.getFirstName() + " " + e.getLastName())
            .orElse("");

        System.out.println(fullName);
    }
}

