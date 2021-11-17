public class JavaLessonSeven {


    public static void main(String[] args) {

        Monster Frank = new Monster();

        Monster Pierogi = new Monster(150, 150, 100);

        Frank.name = "Frank";
        Pierogi.name = "Pierogi";

        System.out.println(Pierogi.name);
        System.out.println(Pierogi.getAttack());
        System.out.println(Pierogi.getHealth());
        System.out.println(Pierogi.getMovement());


        // System.out.println(Frank.name);
        // System.out.println("Object :" + Frank);
        // System.out.println(Frank.name + " has an attack of " + Frank.getAttack());
        // System.out.println(Frank.name + " has a health of " + Frank.getHealth());
    }
}