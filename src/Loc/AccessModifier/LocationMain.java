package Loc.AccessModifier;

import java.util.Scanner;

public class LocationMain {
    public static void main(String[] args) {
        double[][] array = new double[10][10];
        Scanner index = new Scanner(System.in);
        System.out.println("Enter the row and column ");
        Location location = new Location();
        location.row = index.nextInt();
        location.column = index.nextInt();
        System.out.println("Enter your array ");
        for (int i=0;i<location.row;i++){
            for (int j=0; j<location.column;j++){
                array[i][j]=index.nextInt();
            }
        }
        location.locationOFMax(array);
    }
}
