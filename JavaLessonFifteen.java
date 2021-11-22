public class JavaLessonFifteen {

    public static void main(String[] args) {

        Vehicle genericVehicle = new Vehicle(4, 100.00);

        System.out.println(genericVehicle);
        System.out.println(genericVehicle.numOfWheels);
        System.out.println(genericVehicle.theSpeed);

        // genericVehicle.setSpeed(65.5);
        // genericVehicle.setWheels(5);
        System.out.println();
        System.out.println(genericVehicle.getSpeed());
        System.out.println("This car has " + genericVehicle.getWheel() + " wheels");

        System.out.println();
        genericVehicle.setCarStength(15);
        System.out.println(genericVehicle.getCarStrength());
    }
}