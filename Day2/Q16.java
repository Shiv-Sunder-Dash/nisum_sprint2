import java.util.*;

class EmployeeQ16 {
    private String name;
    private String department;
    private Optional<Double> salary;

    public EmployeeQ16(String name, String department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = Optional.ofNullable(salary);
    }

    public String getDepartment() {
        return department;
    }

    public void increaseSalary(double percent) {
        salary.ifPresent(s -> {
            double updated = s + (s * percent / 100);
            System.out.println(name + " - Rs. " + updated);
        });
    }
}

public class Q16 {
    public static void main(String[] args) {
        List<EmployeeQ16> employees = Arrays.asList(
            new EmployeeQ16("Amit", "IT", 50000.0),
            new EmployeeQ16("Neha", "HR", 60000.0),
            new EmployeeQ16("Ravi", "IT", 55000.0)
        );

        employees.stream()
            .filter(e -> e.getDepartment().equals("IT"))
            .forEach(e -> e.increaseSalary(10));
    }
}

