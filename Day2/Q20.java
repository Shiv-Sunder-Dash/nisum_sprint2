import java.util.*;
class EmployeeQ20 {
    private String name;
    private String email;
    private String department;

    public EmployeeQ20(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }
}

public class Q20 {
    public static void main(String[] args) {
        List<EmployeeQ20> employees = Arrays.asList(
            new EmployeeQ20("Amit", "amit@example.com", "IT"),
            new EmployeeQ20("Neha", "neha@example.com", "HR"),
            new EmployeeQ20("Ravi", "ravi@example.com", "Finance")
        );

        boolean anyHR = employees.stream().anyMatch(e -> e.getDepartment().equals("HR"));
        boolean allHaveEmail = employees.stream().allMatch(e -> e.getEmail() != null);
        boolean noneNullName = employees.stream().noneMatch(e -> e.getName() == null);

        System.out.println(anyHR);
        System.out.println(allHaveEmail);
        System.out.println(noneNullName);
    }
}

