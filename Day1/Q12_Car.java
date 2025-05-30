

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

public class Q12_Car implements Vehicle {

    @Override
    public void start() {

        Vehicle.super.start();
        System.out.println("Car has started.");
    }

    public static void main(String[] args) {
        Q12_Car car = new Q12_Car();
        car.start();
    }
}
