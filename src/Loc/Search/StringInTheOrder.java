package Loc.Search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringInTheOrder {

    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        string = scanner.nextLine();
        String[] strings = new String[100];
        char[] chars = string.toCharArray();
        int index = 0,n = 0;
        for (int i = 0; i < chars.length; i++) {
            char[] chars1 = Arrays.copyOf(chars,chars.length);
            while (chars1.length != 0) {
                int j = i;
                char max = chars1[j];
                strings[n] = "";
                while (j < chars1.length) {
                    if (chars1[j] >= max) {
                        strings[n] += chars1[j];
                        max = chars1[j];
                        index = j;
                    }
                    j++;
                }
                for (int k = index; i < chars1.length -1; i++) {
                    chars1[i] = chars1[i+1];
                }
                chars1 = Arrays.copyOf(chars1,chars1.length-1);
                    n++;

            }
        }
    }
}
