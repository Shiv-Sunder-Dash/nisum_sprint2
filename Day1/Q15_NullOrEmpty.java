interface StringUtils {
    static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    static String capitalize(String s) {
        if (isNullOrEmpty(s)) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}

public class Q15_NullOrEmpty {
    public static void main(String[] args) {
        String input1 = "";
        String input2 = "hello";
        String input3 = null;

        System.out.println("Is null or empty: " + StringUtils.isNullOrEmpty(input1));
        System.out.println("Capitalized: " + StringUtils.capitalize(input2));
        System.out.println("Is null or empty: " + StringUtils.isNullOrEmpty(input3));
    }
}
