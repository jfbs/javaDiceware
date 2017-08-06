package diceware;

/*
Return a random number
from a six-sided die
 */

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int side;

    public Dice() {
        side = ThreadLocalRandom.current().nextInt(1,7);
    }

    public int roll() {
        return this.side;
    }

}
