package Loc.Search;

public class BinarySearchUsingRecursiveFunction {
    int[] array =  {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int recursiveBinarySearch(int low, int high, int[] array,int key){
        int mid = (low + high)/2;
        if(low > high ) return -1;
        else
            if(array[mid] > key) return recursiveBinarySearch(low,mid-1,array,key);
            else{
                if(array[mid] < key) return recursiveBinarySearch(mid+1,high,array,key);
                else return mid;
            }
        }

    public static void main(String[] args) {
        int[] array =  {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(recursiveBinarySearch(0,array.length-1,array,2));
        System.out.println(recursiveBinarySearch(0,array.length-1,array,7));
        System.out.println(recursiveBinarySearch(0,array.length-1,array,50));
        System.out.println(recursiveBinarySearch(0,array.length-1,array,80));
        System.out.println(recursiveBinarySearch(0,array.length-1,array,55));
    }
}




