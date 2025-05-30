//Yes, it is possible to create a custom functional interface in Java.
//A functional interface is simply an interface with one abstract method.
//You can define your own and use it with lambda expressions, method references, or
//traditional class-based implementations.


@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

