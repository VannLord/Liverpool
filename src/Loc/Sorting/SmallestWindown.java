package Loc.Sorting;

import java.util.Scanner;

public class SmallestWindown {
    public static boolean contain(char[] strings, char c){
        for (int i = 0; i < strings.length; i++) {
            if(strings[i] == c) return true;
        }
        return false;
    }
    public static boolean contain(char[] chars, char[] chars1,int a,int b){
        boolean check = true;
        char[] chars2 = new char[b-a];
        for (int i = 0; i < chars2.length ; i++) {
            chars2[i] = chars[i+a];
        }
        for (int i = 0; i < chars1.length; i++) {
            check = check & contain(chars2,chars1[i]);
        }
        return check;
    }

    public static void main(String[] args) {
        String givenString, findingChar;
        int m;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the string: ");
            givenString = scanner.nextLine();
            System.out.println("---------");
            System.out.println("Enter the character: ");
            findingChar = scanner.nextLine();
            if (givenString.length() < findingChar.length()) System.out.println("Error! Unable to find!!");
            else {
                char[] arr1 = givenString.toCharArray();
                char[] arr2 = findingChar.toCharArray();
                int n = findingChar.length();
                String string = "";
                boolean check = false;
                while (n < givenString.length()) {
                    for (int i = 0; i < givenString.length() - n; i++) {
                        if (contain(arr1, arr2, i, i + n)) {
                            check = true;
                            for (int j = i; j < i + n; j++) {
                                string += arr1[j];
                            }
                            break;
                        }
                    }
                    if (check) break;
                    else
                        n++;
                }
                if (string == "") System.out.println("Unable to find windown for characters");
                System.out.println("The smallest windown: " + string);
            }
            System.out.println("Press 1 to continue!");
            m = scanner.nextInt();
            scanner.nextLine();
        }while(m ==1 );
    }
}
