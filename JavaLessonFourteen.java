

public class JavaLessonFourteen {

    public static void main(String[] args) {

        Animals pierogi = new Animals("Pierogi", "Marshmellows");
        System.out.println(pierogi);
        System.out.println(pierogi.getName());
        System.out.println(pierogi.favFood);
        pierogi.eatStuff();
        pierogi.walkAround();

        System.out.println();

        Cats miso = new Cats("Miso", "Everything!", "Rianbow Friend");
        System.out.println(miso);
        System.out.println(miso.getName());
        miso.eatStuff();
        miso.walkAround();

    }
}