import java.util.function.Function;

public class Q18_UPPERCASE_AS_A_METHOD_REFERENCE {
    public static void main(String[] args) {
        Function<String, String> toUpper = String::toUpperCase;

        String result = toUpper.apply("hello world");
        System.out.println("Uppercase: " + result);
    }
}

