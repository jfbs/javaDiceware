package diceware;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

    private String needle;
    private File file = new File("src/diceware/diceware.txt");

    public ScanFile() {
        needle = null;
    }

    public String getWord(String str) {
        
        try {
            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.contains(str)) {
                    needle = line;
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return needle;
    }
}
