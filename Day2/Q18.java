import java.util.*;
import java.util.stream.*;

class AddressQ18 {
    private String city;

    public AddressQ18(String city) {
        this.city = city;
    }

    public String toString() {
        return city;
    }
}

class EmployeeQ18 {
    private String firstName;
    private String lastName;
    private AddressQ18 address;

    public EmployeeQ18(String firstName, String lastName, AddressQ18 address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getKey() {
        return firstName + lastName;
    }

    public AddressQ18 getAddress() {
        return address;
    }
}

public class Q18 {
    public static void main(String[] args) {
        List<EmployeeQ18> employees = Arrays.asList(
            new EmployeeQ18("Amit", "Sharma", new AddressQ18("Delhi")),
            new EmployeeQ18("Neha", "Verma", new AddressQ18("Mumbai"))
        );

        Map<String, AddressQ18> result = employees.stream()
            .collect(Collectors.toMap(EmployeeQ18::getKey, EmployeeQ18::getAddress));

        System.out.println(result);
    }
}
