package Loc;



public class C extends A {
    public static void main(String[] args) {
        C c = new C();
        int a = c.enterNumberA();
        int b= c.enterNumberB();
        System.out.println("c contain: "+a+" and "+b);
        int sum =a+b;
        System.out.println("Sum of 2 numbers: "+sum);
        double average = (double) sum/2;
        System.out.println("Average of 2 numbers: "+average);

    }
}
