package diceware;

public class RollDice {
    public static void main(String[] args) {
        String str = "";

        for(int i = 0; i < 5; i++) {
            Dice throwDie = new Dice();
            str += throwDie.roll();
        }

        System.out.println(str);

        ScanFile sf = new ScanFile();
        System.out.println(sf.getWord(str));

    }
}
