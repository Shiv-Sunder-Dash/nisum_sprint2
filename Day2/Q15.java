import java.util.*;

class AddressQ15 {
    private String city;

    public AddressQ15(String city) {
        this.city = city;
    }

    public String toString() {
        return city;
    }
}

class EmployeeQ15 {
    private String name;
    private Optional<AddressQ15> address;

    public EmployeeQ15(String name, AddressQ15 address) {
        this.name = name;
        this.address = Optional.ofNullable(address);
    }

    public String getName() {
        return name;
    }

    public AddressQ15 getAddress() {
        return address.orElse(new AddressQ15("Default City"));
    }
}

public class Q15 {
    public static void main(String[] args) {
        List<EmployeeQ15> employees = Arrays.asList(
            new EmployeeQ15("Amit", new AddressQ15("Delhi")),
            new EmployeeQ15("Neha", null)
        );

        employees.forEach(e ->
            System.out.println(e.getName() + " - " + e.getAddress())
        );
    }
}

