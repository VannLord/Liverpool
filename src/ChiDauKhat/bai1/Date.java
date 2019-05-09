package ChiDauKhat.bai1;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the day: ");
            day = scanner.nextInt();
        }while (day < 1 || day > 31);

        do {
            System.out.println("Enter the month: ");
            month = scanner.nextInt();
        }while (month <1 || month > 12);

        System.out.println("Enter the year: ");
        year = scanner.nextInt();

        System.out.print("The date is: "+month+"/"+day+"/"+year);
    }
}
