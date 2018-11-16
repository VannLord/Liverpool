package Loc;

import java.util.Scanner;

public class MaxLocation {
    public static void main(String[] args) {
        Elenment[] elenments = new Elenment[5];
        int[] ints = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < elenments.length ; i++) {
            System.out.println("ints[" + i + "]: ");
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i < elenments.length ; i++) {
            elenments[i] = new Elenment(0,0);
        }
        for (int i = 0; i < elenments.length ; i++) {
            elenments[i].value = ints[i];
        }
        for (int i = 0; i < elenments.length ; i++){
            for (int j = 0; j < elenments.length ; j++) {
               if (ints[i] == elenments[j].value) elenments[i].key++;
            }
        }
        int max = elenments[0].key;
        int maxValue = elenments[0].value;
        for (int i = 1; i < elenments.length ; i++){
            if(elenments[i].key > max){
                max = elenments[i].key;
                maxValue = elenments[i].value;
            }
        }
        System.out.println("The element "+maxValue+" has the most appearance with "+max+" time");
    }
}
