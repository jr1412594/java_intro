// public name and owner;
// private age, breed, history

public class DogTester {


    public static void main(String[] args) {

        Dog Miso = new Dog();
        Miso.name = "Miso Cat";
        Miso.owner = "Reports to nobody";
        Miso.name = "Master";

        Dog Pierogi = new Dog(2, "ForderCollie", "Started Life as a polish dumpling");
        Pierogi.name = "Pierogi";
        Pierogi.owner = "Karina";



        System.out.println(Miso);
        System.out.println(Miso.name);
        System.out.println(Miso.owner);
        System.out.println(Miso.getAge());
        System.out.println(Miso.getBreed());
        System.out.println(Miso.getHistory());
        System.out.println("");
        System.out.println(Pierogi);
        System.out.println(Pierogi.name);
        System.out.println(Pierogi.owner);
        System.out.println(Pierogi.getAge());
        System.out.println(Pierogi.getBreed());
        System.out.println(Pierogi.getHistory());

    }

}
