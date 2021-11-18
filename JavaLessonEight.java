// Basic Class definition
// public means this class can be used by other classes
// Class names should begin with a capital letter.
// A file can't contain two public classes. It can contain classes that are not public
// If you place class files in the same folder the java compiler will be able to find them.

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


public class JavaLessonEight {

    public static void main(String[] args) {

        MonsterTwo.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        MonsterTwo[] Monsters = new MonsterTwo[5];

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monsters[1] = new MonsterTwo(500, 40, 3, "Miso");
        Monsters[2] = new MonsterTwo(1000, 20, 1, "Pierogi");
        Monsters[3] = new MonsterTwo(800, 10, 5, "Dino");
        Monsters[4] = new MonsterTwo(900, 50, 2, "Cruton");

        char letter = '*';
        MonsterTwo.redrawBoard();
        System.out.println(letter);

    }

}