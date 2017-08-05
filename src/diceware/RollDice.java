package diceware;

public class RollDice {
    public static void main(String[] args) {
        String str = "";
        Dicewds8k ptr = new Dicewds8k();
        for(int i = 0; i < 5; i++) {
            Dice throwDie = new Dice();
            str += throwDie.roll();
        }

        System.out.println(str);
        System.out.println(ptr.getCount());
    }
}
