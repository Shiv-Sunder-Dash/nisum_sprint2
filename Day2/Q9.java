import java.util.*;

class EmployeeQ9 {
    private String firstName;
    private String lastName;
    private String department;

    public EmployeeQ9(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getDepartment() {
        return department;
    }
}

public class Q9 {
    public static void main(String[] args) {
        List<EmployeeQ9> employees = Arrays.asList(
            new EmployeeQ9("Amit", "Sharma", "IT"),
            new EmployeeQ9("Neha", "Verma", "HR"),
            new EmployeeQ9("Ravi", "Kumar", "IT"),
            new EmployeeQ9("Pooja", "Rani", "Sales"),
            new EmployeeQ9("Anil", "Yadav", "Finance"),
            new EmployeeQ9("Kiran", "Mehta", "HR"),
            new EmployeeQ9("Sonal", "Gupta", "IT"),
            new EmployeeQ9("Deepak", "Chopra", "Finance"),
            new EmployeeQ9("Alok", "Bansal", "IT"),
            new EmployeeQ9("Meena", "Joshi", "HR")
);


        employees.stream()
            .skip(7)
            .findFirst()
            .ifPresent(e -> System.out.println(e.getFullName() + " - " + e.getDepartment()));
    }
}


