import java.util.*;

class EmployeeQ7 {
    private int empId;
    private String name;

    public EmployeeQ7(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String toString() {
        return empId + " - " + name;
    }
}

public class Q7 {
    public static void main(String[] args) {
        List<EmployeeQ7> employees = Arrays.asList(
            new EmployeeQ7(101, "Amit"),
            new EmployeeQ7(203, "Neha"),
            new EmployeeQ7(178, "Ravi")
        );

        EmployeeQ7 highest = employees.stream()
            .max(Comparator.comparingInt(EmployeeQ7::getEmpId))
            .orElse(null);

        System.out.println(highest);
    }
}

