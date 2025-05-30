interface Animal {
    default void sound() {
        System.out.println("Animal makes a sound");
    }
}
public class Q13_Dog implements Animal {

    @Override
    public void sound() {

        Animal.super.sound();
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Q13_Dog dog = new Q13_Dog();
        dog.sound();
    }
}
