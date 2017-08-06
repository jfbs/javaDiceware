package diceware;

public class RollDice {
    public static void main(String[] args) {
        String hand;
        String match;

        StringBuilder handBuilder = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            Dice throwDie = new Dice();
            handBuilder.append(throwDie.roll());
        }
        hand = handBuilder.toString();

        System.out.println(hand);

        ScanFile sf = new ScanFile();
        match = sf.getWord(hand);
        System.out.println(match);

        for (String retval: match.split(hand)) {
            System.out.println("New: " + retval);
        }
    }
}
