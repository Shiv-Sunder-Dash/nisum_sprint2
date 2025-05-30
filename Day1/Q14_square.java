
interface MathUtils {
    static int square(int x) {
        return x * x;
    }
}


public class Q14_square {
    public static void main(String[] args) {
        // Call the static method from the interface
        int result = MathUtils.square(5);

        // Print the result
        System.out.println("Square of 5 is: " + result);
    }
}
