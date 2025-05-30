interface A {
    default void run() {
        System.out.println("Running from Interface A");
    }
}
interface B {
    default void run() {
        System.out.println("Running from Interface B");
    }
}
public class Q11_MyClass implements A, B {


    @Override
    public void run() {

        A.super.run();  // or B.super.run();
        System.out.println("Resolved in MyClass");
    }

    public static void main(String[] args) {
        Q11_MyClass obj = new Q11_MyClass();
        obj.run();
    }
}

