package Loc.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] array){
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
        }
    }

    public static void main(String[] args) {
        int[] ints ={5,4,8,3,7,11,1,6};
        insertionSort(ints);
        for (int i = 0; i < ints.length ; i++) {
            System.out.println(ints[i]);
        }
    }
}
