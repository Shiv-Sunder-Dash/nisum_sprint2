import java.util.*;
import java.util.stream.*;

class AddressQ17 {
    private String city;
    private String country;

    public AddressQ17(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return city + ", " + country;
    }
}

public class Q17 {
    public static void main(String[] args) {
        List<AddressQ17> addresses = Arrays.asList(
            new AddressQ17("Mumbai", "India"),
            new AddressQ17("Delhi", "India"),
            new AddressQ17("New York", "USA"),
            new AddressQ17("Delhi", "USA")
        );

        List<AddressQ17> sorted = addresses.stream()
            .sorted(Comparator.comparing(AddressQ17::getCity)
                    .thenComparing(AddressQ17::getCountry))
            .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}
