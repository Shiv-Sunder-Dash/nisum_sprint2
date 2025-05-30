import java.util.*;
import java.util.stream.*;

class EmployeeQ2 {
    private String name;
    private String department;

    public EmployeeQ2(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class Q2 {
    public static void main(String[] args) {
        List<EmployeeQ2> employees = Arrays.asList(
            new EmployeeQ2("Amit", "IT"),
            new EmployeeQ2("Neha", "HR"),
            new EmployeeQ2("Ravi", "IT"),
            new EmployeeQ2("Priya", "Finance")
        );

        Map<String, Long> result = employees.stream()
            .collect(Collectors.groupingBy(EmployeeQ2::getDepartment, Collectors.counting()));

        System.out.println(result);
    }
}
