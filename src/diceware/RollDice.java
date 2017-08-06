package diceware;

public class RollDice {
    public static void main(String[] args) {
        String hand;
        String match;
        String trimmed;
        String passphrase = "";
        int hands = 8;
        //StringBuilder passBuilder = new StringBuilder();

        for(int j = 0; j < hands; j++) {
            hand = "";
            //StringBuilder handBuilder = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                Dice throwDie = new Dice();
                //handBuilder.append(throwDie.roll());
                hand += throwDie.roll();
            }
            //hand = handBuilder.toString();

            ScanFile sf = new ScanFile();
            match = sf.getWord(hand);
            trimmed = match.replace(hand,"").trim();
            // System.out.println(trimmed);
            //passBuilder.append(trimmed).append(" ");
            passphrase += trimmed + " ";
        }
        //passphrase = passBuilder.toString();

        System.out.println(passphrase.trim());

    }
}