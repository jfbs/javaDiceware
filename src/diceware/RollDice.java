package diceware;

public class RollDice {
    public static void main(String[] args) {
        //int[] hand = new int[5];
        String str = "";
        for(int i = 0; i < 5; i++) {
            Dice throwDie = new Dice();
            //hand[i] = throwDie.roll();
            str += throwDie.roll();
        }
        
        System.out.println(str);
    }
}
