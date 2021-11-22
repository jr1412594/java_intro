public class JavaLessonSixteen {

    public static void main(String[] args) {

        Object superCar = new Vehicle();

        System.out.println(((Vehicle) superCar).getSpeed());

        Vehicle superTruck = new Vehicle();

        //equals() method is a built in object method.
        System.out.println(superCar.equals(superTruck));

        System.out.println(superCar.hashCode());
        System.out.println(superTruck.hashCode());

        System.out.println(superTruck.getClass());
        System.out.println(superCar.getClass().getSuperclass());

        System.out.println(superCar.toString());

        int randNumber = 100;

        System.out.println(Integer.toString(randNumber));

        superTruck.setWheels(6);

        Vehicle superTruck2 = (Vehicle) superTruck.clone();

        System.out.println(superTruck2.hashCode());

    }
}