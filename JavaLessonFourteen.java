

public class JavaLessonFourteen {

    public static void main(String[] args) {

        Animals genericAnimal = new Animals();

        // System.out.println(genericAnimal);
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);


        System.out.println();
        Cats miso = new Cats("Miso", "Sushi", "Fly");

        // System.out.println(miso);
        System.out.println(miso.getName());
        System.out.println(miso.favFood);
        System.out.println(miso.favToy);

        Animals tabby = new Cats("Tabby", "Salmon", "ball");

        acceptAnimal(tabby);


    }

    public static void acceptAnimal(Animals randAnimal){
        System.out.println();
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);
        System.out.println();
        System.out.println();
        randAnimal.walkAround();

        Cats tempCat = (Cats) randAnimal;
        System.out.println(tempCat.favToy);

        String secondTemp = ((Cats) randAnimal).favToy;
        System.out.println(((Cats) randAnimal).favToy);
        System.out.println("Second Temp : " + secondTemp);

        System.out.println(randAnimal instanceof Cats);
    }
}