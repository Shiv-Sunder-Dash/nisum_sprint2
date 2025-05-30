import java.util.*;
import java.util.stream.*;

class EmployeeQ8 {
    private String firstName;
    private String lastName;

    public EmployeeQ8(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + lastName;
    }
}

public class Q8 {
    public static void main(String[] args) {
        List<EmployeeQ8> employees = Arrays.asList(
            new EmployeeQ8("Amit", "Sharma"),
            new EmployeeQ8("Neha", "Verma"),
            new EmployeeQ8("Ravi", "Kumar")
        );

        String result = employees.stream()
            .map(EmployeeQ8::getFullName)
            .collect(Collectors.joining("|"));

        System.out.println(result);
    }
}

