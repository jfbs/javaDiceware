package diceware;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RollDice {
    public static void main(String[] args) {
        final int WARMUP_ITERATIONS = 100;
        final int RUN_ITERATIONS = 1000;

        // warm-up
        for (int k = 0; k < WARMUP_ITERATIONS; ++k) {
            String hand, match, trimmed, passphrase;
            int hands = 8; // passphrase length
            StringBuilder passBuilder = new StringBuilder();

            for (int j = 0; j < hands; j++) {
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

            //System.out.println(passphrase.trim());
        }

        // timing
        final long startTime = System.currentTimeMillis();
        for (int k = 0; k < RUN_ITERATIONS; ++k) {
            String hand, match, trimmed, passphrase;
            int hands = 8; // passphrase length
            StringBuilder passBuilder = new StringBuilder();

            for (int j = 0; j < hands; j++) {
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

            //System.out.println(passphrase.trim());
        }

        final long duration = System.currentTimeMillis() - startTime;
        final long average = duration / RUN_ITERATIONS;
        NumberFormat fmt = new DecimalFormat("#0.000");
        System.out.print("Average runtime: " + fmt.format((average)/1000d) + "s");
        //System.out.println("average:");
    }
}