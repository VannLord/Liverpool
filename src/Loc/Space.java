package Loc;

import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        int number;
        Scanner index= new Scanner(System.in);
        System.out.println("Ma tran vuong thu ");
        number =index.nextInt();
        int[][] array = new int[10][10];
        for(int i=0;i<number;i++) {


            for (int j = 0; j < number; j++) {
                System.out.printf("a[%d][%d]= ",i,j);
                array[i][j]=index.nextInt();

            }

        }
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
                System.out.println(array[i][j]+"\t");
            System.out.println("\n");
        }

    }
}