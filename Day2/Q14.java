import java.util.*;

class EmployeeQ14 {
    private String name;
    private Optional<String> email;

    public EmployeeQ14(String name, String email) {
        this.name = name;
        this.email = Optional.ofNullable(email);
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }
}

public class Q14 {
    public static void main(String[] args) {
        List<EmployeeQ14> employees = Arrays.asList(
            new EmployeeQ14("Amit", "amit@example.com"),
            new EmployeeQ14("Neha", null),
            new EmployeeQ14("Ravi", "ravi@example.com")
        );

        employees.forEach(e ->
            System.out.println(e.getName() + " - " + e.getEmail().orElse("No email"))
        );
    }
}
