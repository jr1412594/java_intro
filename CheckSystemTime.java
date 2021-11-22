import java.util.*;
import java.text.DateFormat;

public class CheckSystemTime implements Runnable {

    public void run() {

        Date rightNow;
        Locale currentLocal;
        DateFormat timeFormatter;
        String timeOutput;

        rightNow = new Date();
        currentLocal = new Locale("en");

        timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocal);
        timeOutput = timeFormatter.format(rightNow);

        System.out.println("Time: " + timeOutput);
    }
}