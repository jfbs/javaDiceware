package diceware;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;
import java.util.stream.Stream;

public class RollDice {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "";

        for(int i = 0; i < 5; i++) {
            Dice throwDie = new Dice();
            str += throwDie.roll();
        }

        System.out.println(str);
       // int n = 2;
        //URL path = Diceware.class.getResource("diceware.txt");
        //File f = new File(path.getFile());
        //System.out.println(new File(".").getAbsoluteFile());
            /*Scanner s = new Scanner(new File("./diceware.txt"));
            for (int i = 0; i < n - 1; i++) // Discard n-1 lines
                s.nextLine();
            String lineN = s.nextLine();
            System.out.println(lineN);*/

        /*try {
            String lineN = Files.lines(Paths.get("diceware.txt"))
                .skip(n)
                .findFirst()
                .get();
            System.out.println(lineN);
        }  catch (IOException e) {
            System.err.println("An IOException was caught :"+e.getMessage());
        }*/

        try (Stream<String> lines = Files.lines(Paths.get("src/diceware/diceware.txt"))) {
            String line32 = lines.skip(31).findFirst().get();
            System.out.println(line32);
        }  catch (IOException e) {
            System.err.println("An IOException was caught :"+e.getMessage());
        }

    }
}
