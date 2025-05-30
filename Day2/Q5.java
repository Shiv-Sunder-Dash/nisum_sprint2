import java.util.*;
import java.util.stream.*;

class EmployeeQ5 {
    private String name;
    private String department;

    public EmployeeQ5(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return name + " - " + department;
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<EmployeeQ5> employees = Arrays.asList(
            new EmployeeQ5("Amit", "IT"),
            new EmployeeQ5("Neha", "HR"),
            new EmployeeQ5("Ravi", "Finance"),
            new EmployeeQ5("Pooja", "IT")
        );

        String excludedDept = "IT";

        List<EmployeeQ5> result = employees.stream()
            .filter(e -> !e.getDepartment().equalsIgnoreCase(excludedDept))
            .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}

