package Loc;

import java.util.Scanner;

public class HandleSpaceAndInverseWord {
    public static void main(String[] args) {
        String chuoi;
        int number=0;
        Scanner array= new Scanner(System.in);
        System.out.println("Moi nhap chuoi ");
        chuoi=array.nextLine();
        char[] a ;
        int l = chuoi.length();
        a = chuoi.toCharArray();
        for(int i=0;i<l-1;i++)
        {
            if ((a[i]==' '&& a[i+1]==' ')||a[0]==' ') {
                for (int j = i; j < l-1; j++) a[j] = a[j + 1];
                i--;
                l--;
            }

        }
        System.out.println("Sau xử lý dấu cách: ");
        for (int i = 0; i <chuoi.length() ; i++) {
            System.out.printf("%c",a[i]);

        }
        System.out.println("\nSau khi đảo từng chữ: ");
        while(a[0]==' ')
        {
            for(int i=0;i<l-1;i++) a[i]=a[i+1];
            l--;
        }
        while (a[l-1]==' ') l--;
        int j=0;
        while (number<l){
            while(a[j]!=' ') {
                j++;
                if (j == l) break;
            }


                for (int n = j - 1; n >= number; n--)
                    System.out.printf("%c",a[n]);
                System.out.printf(" ");
                number = ++j;
            }
        }

        }



