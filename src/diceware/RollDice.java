package diceware;

public class RollDice {
    public static void main(String[] args) {
        String hand;
        String match;
        String trimmed;
        String passphrase;
        int hands = 5;
        StringBuilder passBuilder = new StringBuilder();

        for(int j = 0; j < hands; j++) {
            StringBuilder handBuilder = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                Dice throwDie = new Dice();
                handBuilder.append(throwDie.roll());
            }
            hand = handBuilder.toString();

            //System.out.println(hand);

            ScanFile sf = new ScanFile();
            match = sf.getWord(hand);
            trimmed = match.replace(hand, "").trim();
            //System.out.println(trimmed);

            passBuilder.append(trimmed).append(" ");
        }
        passphrase = passBuilder.toString();

        System.out.println(passphrase.trim());

    }
}
