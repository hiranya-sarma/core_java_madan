public class CarMain {

    static {
        System.out.println("Static block from same class is being executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method invocation started");
        Car car1 = new Car();
        Car car2 = new Car("BMW", "Blue", 100);
        System.out.println(Car.NO_OF_WHEELS);
    }
}
