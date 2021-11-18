import java.util.Arrays;


public class JavaLessonNine {

    public static void main(String[] args) {

        int[] randomArray;

        
        randomArray = new int[20];
        randomArray[1] = 2;
        
        String[] stringArray = {"just", "random", "Words"};
        
        int[] numberArray = new int[10];

        for(int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }
        // System.out.println(Arrays.toString(numberArray) + "this is the array");

        int k = 1;
        while(k <= 41) { System.out.print('-'); k++;}
        System.out.println();

        for (int i = 0; i < numberArray.length; i++) {
            
            System.out.print("|" + i + "");
        }
        System.out.print("|");
        System.out.println();
        k = 1;
        while (k <= 41) {System.out.print("-"); k++;}

        System.out.println();

        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;
            }
        }

        k = 1;
        while(k <= 61) {System.out.print("-"); k++;}
        System.out.println();

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println();
        }

        k = 1;
        while(k <= 61) {System.out.print("-"); k++;}

        // System.out.print(Arrays.deepToString(multiArray) + "deep to string");
        System.out.println();

        for (int row : numberArray) {
            System.out.print(row);
        }
System.out.println();

        for (String[] rows : multiArray) {
            for (String column : rows) {
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }
        System.out.println();

        int[] numberCopy = Arrays.copyOf(numberArray, 3);

        System.out.print(Arrays.toString(numberCopy));

        for(int numb : numberCopy) {
            System.out.println(numb + " :this is my number copy in my enhanced for loop");
        }

        int[] rangeCopy = Arrays.copyOfRange(numberArray, 3, 4);



        System.out.print(Arrays.toString(numberArray));
        for (int num : rangeCopy) {
            System.out.println(num + " :range copy");
        }

        int[] moreNumbers = new int[100];

        Arrays.fill(moreNumbers, 2);


        // System.out.print(Arrays.toString(moreNumbers));



        int[] numToSort = new int[10];

        for(int i = 0; i < numToSort.length; i++) {
            int randNum = (int) (Math.random() * 51);
            numToSort[i] = randNum;
        }

        Arrays.sort(numToSort);
        System.out.print(Arrays.toString(numToSort));


        int whereIs50 = Arrays.binarySearch(numToSort, 50);

        System.out.print(whereIs50);
    }
}