package Loc.Sorting;

public class InsertionSortShow {
    public static void insertionSortShow(int[] array){
        int t;
        for (int i = 1; i < array.length;i++) {
            int j=i;
            while(j != 0){
                if(array[j] < array[j-1]){
                    t = array[j];
                    array[j] = array[j-1];
                    array[j-1] = t;
                }
                j--;
            }
            System.out.print("After "+ i + " step, the array becomes: ");
            for (int k = 0; k < array.length ; k++) {
                System.out.print(" ,"+array[k]);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int[] ints ={24,20,74,54,96,11,3,87,64,99};
        insertionSortShow(ints);
        }
    }


