package Loc.Search;

public class BinarySearch {
    static int[] list = {1,3,4,7,9,11,15,27,30};
    static int binarySearch(int[] list,int key){
       int high = list.length-1;
       int low = 0;
       while(high >= low ){
           int mid =(high+low)/2;
           if(list[mid] > key) high = mid - 1;
           else if (list[mid] < key) low = mid + 1;
           else return mid;
       }
       return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 7));
        System.out.println(binarySearch(list, 9));
        System.out.println(binarySearch(list, 15));
        System.out.println(binarySearch(list, 20));
        System.out.println(binarySearch(list, 27));
    }
}
