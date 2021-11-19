// import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        // int[] numberArray = new int[15];

        // int k = 1;
        // while(k < 41) {System.out.print("-"); k++;}
        // System.out.println();

        // for(int i = 0; i < numberArray.length; i++) {
        //     numberArray[i] = i;
        // }

        // for(int j = 0; j < numberArray.length; j++) {
        //     System.out.print("| " + numberArray[j] + " ");
        // }
        // System.out.println("|");
        // k = 1; 
        // while(k < 41) {System.out.print("-"); k++;}

        String[][] twoDArray = new String[10][10];

        int k = 1;
        while (k <= 61) { System.out.print("-"); k++; }
        System.out.println();

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = i + " " + j;
            }
        }

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i]. length; j++) {
                System.out.print("| " + twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        k = 1;
        while (k <= 61) { System.out.print("-"); k++; }




    }
}