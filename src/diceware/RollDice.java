package diceware;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {
        String str = "";

        for(int i = 0; i < 5; i++) {
            Dice throwDie = new Dice();
            str += throwDie.roll();
        }

        System.out.println(str);

        File file = new File("src/diceware/diceware.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
            while(in.hasNext()) {
                String line=in.nextLine();
                if(line.contains(str))
                    System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
