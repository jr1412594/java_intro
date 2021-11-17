public class Dog {

    public String name = "Name me";
    public String owner = "No Owner";

    private int age = 2;
    private String breed = "Mutt";
    private String history = "None";

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getHistory() {
        return history;
    }

    public Dog() {

    }

    public Dog(int newAge, String newBreed, String newHistory) {
        age = newAge;
        breed = newBreed;
        history = newHistory;
    }


}