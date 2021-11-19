import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLessonEleven {

    public static void main(String[] args) {

        ArrayList arrayListOne; 

        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();


        ArrayList<String> names = new ArrayList<String>();

        names.add("Pierogi");
        names.add("Miso");
        names.add("Dino");

        names.add("Karina");
        names.add("Junior");

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // names.remove(3);


        int k = 1;
        while(k < 21) { System.out.print("-"); k++;}
        System.out.println();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();
        System.out.println(names);

        // Creates an iterator object (indivItems)s
        // Iterator indivItems = names.iterator(); 

        // while(indivItems.hasNext()) {
        //     System.out.println(indivItems.next() + " : this is the iterator");
        // }

        ArrayList nameCopy = new ArrayList();

        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        String paulYoung = "Paul Young";

        names.add(paulYoung);

        if(names.contains(paulYoung)) {
            System.out.println("I found that paul guy!");
        }

        if(names.containsAll(nameCopy)) {
            System.out.println("These lists are the same!");
        } else {
            System.out.println("They are not the same.");
        }

        // nameCopy.clear();
        if(nameCopy.isEmpty()) {
            System.out.println("This list is gone.");
        }
        System.out.print(nameCopy);
        Object[] moreNames = new Object[4];

        moreNames = nameCopy.toArray();

        System.out.print(Arrays.toString(moreNames));

        ArrayList stuff = new ArrayList();

        stuff.add(5);
        stuff.add(true);
        stuff.add('*');
        stuff.add("Pierogi");
        System.out.println();
        System.out.println(stuff);

        Object[] newStuff = new Object[2];

        newStuff = stuff.toArray();

        System.out.println();
        System.out.println(Arrays.toString(newStuff) + "this is the array");
        System.out.println();
        System.out.println(newStuff.getClass().getSimpleName() + "this is the name.");

    }
}
