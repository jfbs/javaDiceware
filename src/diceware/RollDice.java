package diceware;

public class RollDice {
    public static void main(String[] args) {
        String hand = "";
        String match = "";

        for(int i = 0; i < 5; i++) {
            Dice throwDie = new Dice();
            hand += throwDie.roll();
        }

        System.out.println(hand);

        ScanFile sf = new ScanFile();
        match = sf.getWord(hand);
        System.out.println(match);
       // System.out.println(val.substring(1));
        for (String retval: match.split(hand)) {
            System.out.println("New: " + retval);
        }
    }
}
