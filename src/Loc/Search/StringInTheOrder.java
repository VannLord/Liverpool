package Loc.Search;

import java.util.Scanner;

public class StringInTheOrder {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        string = scanner.nextLine();
        char[] chars = string.toCharArray();
        int index = 0;
        char max = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>=max){
                System.out.print(chars[i]);
                max = chars[i];
                index = i;
            }
        }
    }
}
