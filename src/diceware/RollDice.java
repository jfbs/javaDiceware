package diceware;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RollDice {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        String hand, match, trimmed, passphrase;
        int hands = 8; // passphrase length
        StringBuilder passBuilder = new StringBuilder();

        for(int j = 0; j < hands; j++) {
            StringBuilder handBuilder = new StringBuilder();

            for (int i = 0; i < 5; i++) {  // get five dice
                Dice throwDie = new Dice();
                handBuilder.append(throwDie.roll());
            }
            hand = handBuilder.toString(); // all five dice

            ScanFile sf = new ScanFile();
            match = sf.getWord(hand);
            trimmed = match.replace(hand, "").trim();
            passBuilder.append(trimmed).append(" ");
        }
        passphrase = passBuilder.toString();

        System.out.println(passphrase.trim());

        final long duration = System.currentTimeMillis() - startTime;
        NumberFormat fmt = new DecimalFormat("#0.000");
        System.out.print("Runtime: " + fmt.format((duration)/1000d) + "s");
    }
}