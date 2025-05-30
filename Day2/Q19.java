import java.util.*;
class EmployeeQ19 {
    private String name;

    public EmployeeQ19(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Q19 {
    public static void main(String[] args) {
        List<EmployeeQ19> employees = Arrays.asList(
            new EmployeeQ19("Amit"),
            new EmployeeQ19("Neha"),
            new EmployeeQ19("Ravi")
        );

        Optional<EmployeeQ19> any = employees.stream().findAny();
        Optional<EmployeeQ19> first = employees.stream().findFirst();

        any.ifPresent(System.out::println);
        first.ifPresent(System.out::println);
    }
}
