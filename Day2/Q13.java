import java.util.*;
import java.util.stream.*;

class EmployeeQ13 {
    private String name;
    private double salary;

    public EmployeeQ13(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " - Rs. " + salary;
    }
}

public class Q13 {
    public static void main(String[] args) {
        List<EmployeeQ13> employees = Arrays.asList(
            new EmployeeQ13("Amit", 60000),
            new EmployeeQ13("Neha", 50000),
            new EmployeeQ13("Ravi", 75000)
        );

        List<EmployeeQ13> sorted = employees.stream()
            .sorted(Comparator.comparingDouble(EmployeeQ13::getSalary))
            .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}

