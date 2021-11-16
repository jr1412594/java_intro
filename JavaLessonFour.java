import java.util.Scanner;

public class JavaLessonFour {

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {

        // int i = 0;

        // while(i <= 10) 
        // {
        //     if (i == 3){
        //         i++;
        //         continue;
        //     }

        //     System.out.println(i);
        //     i++;

        // }
////////////////////////////////////////////////////////////////

        String contYorN = "Y";

        int h = 1;

        while (contYorN.equalsIgnoreCase("y"))
        {
            System.out.println(h);
            System.out.print("Continue y or n? ");
            contYorN = userInput.nextLine();
            h++;
        }

    }

}