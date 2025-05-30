import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Q21_generate_and_print_5_random_numbers {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;

        IntStream.range(0, 5).forEach(i -> System.out.println("Random number " + (i + 1) + ": " + randomSupplier.get()));
    }
}
