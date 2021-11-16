public class JavaLessonThree
{
    public static void main(String[] args)
    {
        // int randomNumber = (int) (Math.random() * 50);
        
        // if (randomNumber < 25) 
        // {
        //     System.out.println("Random is less than 25");
        // } 
        // else if (randomNumber > 40)
        // {
        //     System.out.println("The random number is greater than 40");
        // } 
        // else
        // {
        //     System.out.println("The number is between 25 and 40");
        // }
        
        // // System.out.println("The random number is " + randomNumber);
        // if ((false) ^ (true))
        // {
        //     System.out.println("The ^ works.");
        // }
        // else
        // {
        //     System.out.println("both are true or false");
        // }
/// TERNARY STATEMENT
        // int valueOne = 4;
        // int valueTwo = 2;    

        // int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;

        // System.out.println(biggestValue);


        char theGrade = 'b';

        switch (theGrade)
        {
            case 'A': 
            System.out.println("You crushed that test");
            break;
            // case 'b': //catch
            case 'B' | 'b': //catch
            System.out.println("You did okay");
            break;
            case 'C':
            System.out.println("This is satisfactory");
            break;
            default:
            System.out.println("You better call your parents..");
            break;
        }
    }
}