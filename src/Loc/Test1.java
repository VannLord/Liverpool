package Loc;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        {
            int n,i,j,k;
            boolean kt;
            int[] s = new int[100];
            Scanner scanner = new Scanner(System.in);
            System.out.print("n= ,k=" );
            n=scanner.nextInt();
            k=scanner.nextInt();
            for(i=1;i<=k;i++)
            {
                s[i]=i;
                System.out.print(s[i]);
            }
            System.out.print("\n");
            while(true)
            {
                i=k;
                while(s[i]==n) i--;
                s[i]++;
                for(j=i+1;j<=k;j++) s[j]=1;
                for(i=1;i<=k;i++) System.out.print(s[i]);
                System.out.print("\n");
                kt=true;
                for(i=1;i<=k;i++) if(s[i]!=n)
                {
                    break;
                }
                if(kt) break;
            }
        }
    }
}
