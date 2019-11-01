package Loc.Thread;

import java.util.Random;

public class RacingBoyz implements Runnable {
    public static int DISTANCE = 100;
    public static int STEP = 10;
    private String name;

    public RacingBoyz(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE){
            try{
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log ="|";
                int percentTravel = (runDistance*100)/DISTANCE;
                for (int i = 0; i < DISTANCE ; i+= STEP) {
                    if(percentTravel >= i+STEP ){
                        log += "=";
                    }else if(percentTravel >= i && percentTravel < i+STEP){
                        log += "o";
                    }else {
                        log += "-";
                    }
                }
                log +="|";
                System.out.println("The RacingBoyz with the name "+name+": "+log+" "+Math.min(DISTANCE,runDistance)+ "KM");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("The RacingBoyz "+name+" disappear");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("The RacingBoyz "+name+" finish in "+ (endTime -startTime)/1000 +  "s");
    }

    public static void main(String[] args) {
        RacingBoyz racingBoyz1 = new RacingBoyz("LorD");
        RacingBoyz racingBoyz2 = new RacingBoyz("Loc");
        RacingBoyz racingBoyz3 = new RacingBoyz("Kann");
        Thread thread1 = new Thread(racingBoyz1);
        Thread thread2 = new Thread(racingBoyz2);
        Thread thread3 = new Thread(racingBoyz3);
        System.out.println("DISTANCE: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
