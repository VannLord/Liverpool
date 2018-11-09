package Loc;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ReadIntegerByEnglish {
    public static void main(String[] args) {
        int n;
        Scanner num= new Scanner(System.in);
        System.out.println("nhap n ");
        n=num.nextInt();
        switch (n/100)
        {
            case 1:
                System.out.println("one hundred");break;
            case 2:
                System.out.println("two hundred");break;
            case 3:
                System.out.println("three hundred");break;
            case 4:
                System.out.println("four hundred");break;
            case 5:
                System.out.println("five hundred");break;
            case 6:
                System.out.println("six hundred");break;
            case 7:
                System.out.println("seven hundred");break;
            case 8:
                System.out.println("eight hundred");break;
            case 9:
                System.out.println("nine hundred");break;

        }
        if(n>100&&n%100!=0) System.out.println("and");
        if ((n%100)/10==1)
            switch (n%100){
                case 11:
                    System.out.println("eleven");break;
                case 12:
                    System.out.println("twelve");break;
                case 13:
                    System.out.println("thirteen");break;
                case 14:
                    System.out.println("fourteen");break;
                case 15:
                    System.out.println("fifteen");break;
                case 16:
                    System.out.println("sixteen");break;
                case 17:
                    System.out.println("seventeen");break;
                case 18:
                    System.out.println("eighteen");break;
                case 19:
                    System.out.println("nineteen");break;
            }
        if ((n%100)/10!=0)
        switch ((n%100)/10)
        {
            case 2:
                System.out.println("twenty");break;
            case 3:
                System.out.println("thirty");break;
            case 4:
                System.out.println("forty");break;
            case 5:
                System.out.println("fifty");break;
            case 6:
                System.out.println("sixty");break;
            case 7:
                System.out.println("seventy");break;
            case 8:
                System.out.println("eighty");break;
            case 9:
                System.out.println("ninety");break;

        }
        if((n%100)/10!=1)
        switch ((n%100)%10)
    {

        case 1:
            System.out.println("one");;break;
        case 2:
            System.out.println("two");;break;
        case 3:
            System.out.println("three");;break;
        case 4:
            System.out.println("four");;break;
        case 5:
            System.out.println("five");;break;
        case 6:
            System.out.println("six");;break;
        case 7:
            System.out.println("seven");;break;
        case 8:
            System.out.println("eight");;break;
        case 9:
            System.out.println("nine");;break;
        case 10:
            System.out.println("ten");;break;



    }
}}