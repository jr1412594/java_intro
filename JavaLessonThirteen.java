import java.util.Arrays;

public class JavaLessonThirteen {

    public static void main(String[] args) {

        String randomString = "I'm just a randomstring";

        String gotTOWuote = "He said, \"I'm here\"";

        int numTwo = 2;

        System.out.println(randomString + " " + numTwo);

        String uppercaseStr = "BIG";
        String lowercaseStr = "big";

        if (uppercaseStr.equalsIgnoreCase(lowercaseStr)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are not the same");
        }

        String letters = "abcde";
        String moreLetters = "fghijk";

        System.out.println(moreLetters.compareTo(letters) + " compare");

        System.out.println(letters.charAt(3) + " expect to be 'd' " );
        System.out.println(letters.endsWith("e") + " ends with e true");
        System.out.println(letters.indexOf("c") + " expect 2");
        System.out.println(moreLetters.contains("jk") + " expect to be true");

        System.out.println(letters.replace("ab", "different amount"));


        String[] letterArray = letters.split("");

        System.out.println(Arrays.toString(letterArray) + " :letters array");

        StringBuilder randSB = new StringBuilder("A random value");

        randSB.append(" again");
        System.out.println(randSB);

        System.out.println(randSB.capacity());

        randSB.ensureCapacity(55);

        System.out.println(randSB.capacity());

        randSB.trimToSize();

        randSB.insert(1, "nother");

        System.out.println(randSB);

    }
}