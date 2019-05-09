package ChiDauKhat.bai9;

import java.util.Random;

public class Dice {
    int value;

    public int getValue() {
         value = (new Random().nextInt(6)+1);
        return value;
    }
    public Dice(){}
}
