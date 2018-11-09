package Loc.AccessModifier;

public class Location {
     public int row,column;
     public double maxValue;
     public void locationOFMax(double[][] a){
         int rowmax=0,columnmax=0;
         maxValue = a[0][0];
         for(int i=0;i<row;i++) {
             for (int j = 0; j < column; j++) {
                 if (a[i][j] > maxValue) {
                     maxValue = a[i][j];
                      rowmax = i;
                      columnmax = j;
                 }
             }
         }
         System.out.println("The location of Maximum Value is " + maxValue + "at (" + rowmax + "," +columnmax+")" );


    }
}
