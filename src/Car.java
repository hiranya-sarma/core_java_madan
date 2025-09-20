public class Car {

    String model;
    String color;
    int horsePower;
    static final byte NO_OF_WHEELS = 4;
    static  byte noOfEngines;

    static {
        // Initialize static data for all Car instances once when the class is loaded
        noOfEngines = 1;
        System.out.println("Static block is being executed");
    }

    {
        System.out.println("Car instance is being executed");
    }

     public Car() {
     }
     public Car(String model, String color, int horsePower) {
         this.model = model;
         this.color = color;
         this.horsePower = horsePower;
        }

}
