//A custom functional interface is just an interface with exactly one abstract method,
//and you can use the @FunctionalInterface annotation to ensure the interface remains functional



@FunctionalInterface
interface Calculator1 {
    int operate(int a, int b);
}

