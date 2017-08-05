package diceware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.util.stream.Stream;

public class RollDice {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "";

        for(int i = 0; i < 5; i++) {
            Dice throwDie = new Dice();
            str += throwDie.roll();
        }

        System.out.println(str);

        try (Stream<String> lines = Files.lines(Paths.get("src/diceware/diceware.txt"))) {
            String line32 = lines.skip(31).findFirst().get();
            System.out.println(line32);
        }  catch (IOException e) {
            System.err.println("An IOException was caught :"+e.getMessage());
        }

    }
}
