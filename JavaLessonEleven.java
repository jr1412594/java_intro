import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


public class JavaLessonEleven {

    public static void main(String[] args) {

        ArrayList<Object> arrayListOne;

        arrayListOne = new ArrayList<Object>();

        ArrayList arrayListTwor = new ArrayList();

        ArrayList<String> names = new ArrayList<String>();

        names.add("Pierogi");
        names.add("Miso Cat");
        names.add("Karina Love");

        names.add(2, "Junior");

        // System.out.println(names.get(1) + " " + " " + names.get(2));

        // for (int i = 0; i < names.size(); i++) {
        //     System.out.println(names.get(i));
        // }

        ArrayList check = new ArrayList();

        check.add(5);
        check.add(true);
        check.add("Miso");
        check.add("Pierogi");
        check.add(3.1415);
        check.add(null);

        check.set(0, "this was 5");

        for (int i = 0; i < check.size(); i++) {
            System.out.println(check.get(i));
        }        
    }
}