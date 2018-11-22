package Loc.Sorting;

public class BubbleSort {
    static int[] array = {7,4,11,26,01,30,06,35};
    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;

        for (int k = 1; k < array.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

