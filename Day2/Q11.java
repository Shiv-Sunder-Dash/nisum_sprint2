import java.util.*;
import java.util.stream.*;

class EmployeeQ11 {
    private String name;
    private String gender;

    public EmployeeQ11(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

public class Q11 {
    public static void main(String[] args) {
        List<EmployeeQ11> employees = Arrays.asList(
            new EmployeeQ11("Amit", "MALE"),
            new EmployeeQ11("Neha", "FEMALE"),
            new EmployeeQ11("Ravi", "MALE"),
            new EmployeeQ11("Pooja", "FEMALE")
        );

        Map<String, Long> genderCount = employees.stream()
            .collect(Collectors.groupingBy(EmployeeQ11::getGender, Collectors.counting()));

        System.out.println(genderCount);
    }
}

