import java.util.Scanner; //allows for user input


public class javaLessonTwo  //class name must be the same name as your file
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Your favorite number: ");

        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();

            System.out.println("You Entered " + numberEntered);

            int numberEnteredTimes2 = numberEntered + numberEntered;

            int numberEnteredMinusTwo = numberEntered - 2; 

            int multipliedEnteredNumber = numberEntered * 2;

            int numberEnteredDividedByTwo = numberEntered / 2;

            numberEntered += 2;

            System.out.println("Your number entered + 2 is " + numberEntered);
            // System.out.println("Your number times 2 is " + numberEnteredTimes2);
            // System.out.println("Your number times 2 a different way is " + multipliedEnteredNumber);
            // System.out.println("Your number minus 2 is " + numberEnteredMinusTwo);
            // System.out.print("your number divided by 2 is " + numberEnteredDividedByTwo);
        } else {
            System.out.println("Enter an integer");
        }
    }
}