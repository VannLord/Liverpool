package Loc.MyException;

import java.util.Scanner;

public class IllegalTriangleTest {
    public static void main(String[] args)  {

            int a,b,c;
            Scanner scanner = new Scanner(System.in);
            System.out.println("The first edge: ");
            a = scanner.nextInt();
            System.out.println("The next edge: ");
            b = scanner.nextInt();
            System.out.println("The last edge: ");
            c = scanner.nextInt();
            TriangleTest(a,b,c);


        }


    public static void TriangleTest(int a,int b, int c) throws IllegalTriangleException{
        if(a > b+c||c > b+a||b > a+c||a <= 0|| b <= 0||c <= 0){
            IllegalTriangleException e = new IllegalTriangleException("The triangle is illegal");
            e.getStackTrace();
            throw  e;

        }
    }
}
