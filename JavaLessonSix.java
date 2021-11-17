// import java.util.*;
import java.io.*;

public class JavaLessonSix {

    // static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        try{
            getAFile("./someStuff.txt");
        }
        catch (IOException e) {
            System.out.println("An IO Exception Occured.");
        }
        // System.out.println("How old are you?");

        // int age = checkValidAge();

        // if (age != 0) {
        //     System.out.println("You are " + age + " years old");
        // }

        // divideByZero(2);

    }

    public static void getAFile(String fileName) throws IOException, FileNotFoundException {

        FileInputStream file = new FileInputStream(fileName);


///////////////////////////////////////////////////////////////////////
        // try {
        //     FileInputStream file = new FileInputStream(fileName);

        // }
        // catch (FileNotFoundException e) {
        //     System.out.println("Sorry cant find that file");
        // }

        // catch (IOException e) {
        //     System.out.println("Unknown IO Error");
        // }
        // // Ignore an exception by leaving the block empty. "{}"
        // // Can also have multiple exceptions in catch by using the or oporator "|"
        // catch (ClassNotFoundException | IOException e) {}

        // catch (Exception e) {
        //     System.out.println("Some error occured");
        // }
        // //Finally will execute whether an exception was caught or not.
        // finally {
        //     System.out.print("We have reached the finally..");
        // }
//////////////////////////////////////////////////////////////////////////////
    }

    // public static int checkValidAge() {
    //     try{
    //         return userInput.nextInt();
    //     }
    //     catch(InputMismatchException e) {
    //         userInput.next();
    //         System.out.println("That isn't a whole number");
    //         return 0;
    //     }
        
    // }

    // public static void divideByZero(int a) {
        
    //     try{
    //         System.out.println(a/0);
    //     }

    //     catch(ArithmeticException e){
    //         System.out.println("You can't do that!");
    //         //Will print the sting "You can't do that!"
    //         System.out.println(e.getMessage());
    //         //Will print the error message " / by zero"
    //         System.out.print(e.toString());
    //         //Will print out name of exception and error 
    //         //"java.lang.ArithmeticException: / by zero%"
    //         e.printStackTrace();
    //         //Will print out where the issue is happening.
    //     }
    // }

}