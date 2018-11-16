package Loc.Search;

import java.util.Scanner;

public class LongestStringInTheOrder {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        string = scanner.nextLine();
        char[] chars = string.toCharArray();
        String[] strings = new String[10];
        int j = 0, n = 0, i = 0;
        while(i < chars.length - 1 ){
            do{
                i++;
                if(i==chars.length-1) break;
            }
            while (chars[i] < chars[i+1]);

            strings[n] = "";
            for (int k = j; k < i + 1 ; k++) {
                strings[n] += chars[k];
            }
            n++;
            j=++i;
        }
        int max = (strings[0].toCharArray()).length, index = 0;
        for (int k = 1; k < n ; k++) {
            if(max < (strings[k].toCharArray()).length){
                max =(strings[k].toCharArray()).length;
                index = k;
            }
        }
        System.out.println(strings[index]);
    }
}
