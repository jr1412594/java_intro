import java.util.Arrays;
import java.util.LinkedList;

public class JavaLessonTwelve {

    public static void main(String[] args) {

        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("Pierogi");
        names.add("Miso");
        names.add("Karina");
        names.add("Dino");

        names.set(3, "Larger Dino");

        names.addLast("Domino");

        names.addFirst("George Washington");
        names.add(0, "Darth Vader");

        names.remove(5); // removing "Larger Dino";
        names.remove("George Washington"); // removing George Washington


        // System.out.println(names.lastIndexOf("Karing") + " : Expect this to be -1");

        System.out.println();

        for (String item : names) {
            System.out.println(item + " : this is the item " + names.indexOf(item));
        }

        String firstIndex = names.get(0);
        String secondIndex = names.get(1);
        String lastItem = names.getLast();

        System.out.println("\nFirst Index: " + names.get(0));
        System.out.println(firstIndex + " :Im the first index too!");
        System.out.println(secondIndex + " :Im the second index");
        System.out.println(lastItem + " :Im the last item");

        LinkedList<String> copyOfName = new LinkedList<String>(names);

        System.out.println(copyOfName + "this is the copy");

        System.out.println("\n List top : " + copyOfName.isEmpty());
        
        System.out.println("this is the peek: " + copyOfName.peek());
        copyOfName.removeAll(copyOfName);
        
        System.out.println("\n List bottom: " + copyOfName.isEmpty());
        System.out.println("this is the Second peek: " + copyOfName.peek());

        Object[] listArray = new Object[5];

        listArray = names.toArray();

        System.out.println(Arrays.toString(listArray));
        System.out.println("this is the array: " + listArray + listArray.getClass().getSimpleName());


        // if(names.contains(copyOfName.get(0))) {
        //     System.out.println("these are the same items");
        // }

        // LinkedList<String> copyOfName = new LinkedList<String>();


        // copyOfName = (LinkedList) names.clone();


        // System.out.print(names);
        // System.out.println(names.getClass().getSimpleName());
    }
}