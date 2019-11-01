package Loc.Thread;

public class IntegerTest {
    public static void main(String[] args) {
        OddInteger oddInteger = new OddInteger();
        EvenInteger evenInteger = new EvenInteger();
        Thread thread1 = new Thread(oddInteger);
        Thread thread2 = new Thread(evenInteger);
        thread1.start();
        thread2.start();
    }
}
