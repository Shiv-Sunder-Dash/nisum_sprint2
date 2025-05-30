import java.util.*;
import java.util.stream.*;

class EmployeeQ12 {
    private String name;
    private String gender;

    public EmployeeQ12(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}

public class Q12 {
    public static void main(String[] args) {
        List<EmployeeQ12> employees = Arrays.asList(
            new EmployeeQ12("John", "MALE"),
            new EmployeeQ12("Mike", "MALE"),
            new EmployeeQ12("Alice", "FEMALE"),
            new EmployeeQ12("Lily", "FEMALE")
        );

        Map<String, String> grouped = employees.stream()
            .collect(Collectors.groupingBy(
                EmployeeQ12::getGender,
                Collectors.mapping(EmployeeQ12::getName, Collectors.joining("-"))
            ));

        String result = grouped.entrySet().stream()
            .map(e -> e.getKey() + ": [" + e.getValue() + "]")
            .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}

