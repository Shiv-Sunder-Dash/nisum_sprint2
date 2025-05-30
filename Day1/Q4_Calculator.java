@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}
 class Calculator {

    public int compute(int a, int b, Operation op) {
        return op.apply(a, b);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();


        Operation addition = (x, y) -> x + y;
        System.out.println("Addition: " + calc.compute(10, 5, addition));  // Output: 15


        Operation multiplication = (x, y) -> x * y;
        System.out.println("Multiplication: " + calc.compute(10, 5, multiplication));  // Output: 50
    }
}


