package Loc;

public class JavaEx {
    public void one1FirstDegreeEquation(int a,int b)
    {
        System.out.println("\nEx 1: ");
        if (a == 0) System.out.println(" The equation has no solution !!");
        else
        System.out.println("The first degree equation "+a+"x + "+b+ " = 0 has solution x = "+ (float)-b/a);
    }
    public void ex2SecondDegreeEquation(int a, int b, int c)
    {
        System.out.println("\nEx 2: ");
        float x1,x2;

        String stringResult;
        float delta = b*b - 4*a*c;

        if(delta > 0)
        {
            x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
            x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
            if(a == 1)
                stringResult = "x^2 + "+b+"x + " +c+" = 0 có 2 nghiệm x1 = "+x1+", x2= "+x2;
            else
                stringResult = a+"x^2 + "+b+"x + " +c+" = 0 có 2 nghiệm x1 = "+x1+", x2= "+x2;
        }
        else if(delta == 0)
        {
            if(a == 1)
                stringResult = "x^2 + "+b+"x + " +c+" = 0 có nghiệm kép x = " +((float) -b/(2*a));
            else
                stringResult = a+"x^2 + "+b+"x + " +c+" = 0 có nghiệm kép x = " +((float) -b/(2*a));
        }else{
            if(a==1)
                stringResult = "x^2 + "+b+"x + " +c+" = 0 vô nghiệm";
            else
                stringResult = a+"x^2 + "+b+"x + " +c+" = 0 vô nghiệm";
        }
        System.out.println(stringResult);
    }
    public void ex3IntermediaryNumber(int a, int b, int c)
    {
        System.out.println("\nEx 3: ");
        int max = (c > b && c > a) ? c :(b > a) ? b : a;
        int min = (c < b && c < a) ? c :(b < a) ? b : a;
        System.out.println("The intermediary number is: "+(a + b + c - max - min));
    }
    public void ex4Karaoke(int b, int a)
    {
        System.out.println("\nEx 4: ");
        int money;
        if( b - a > 18) money = (b - a) * 60000;
        else money = (b - a) * 45000;
        System.out.println("The karaoke fee is: " + money + "vnd");

    }
    public void ex5DayInCalendar(int month, int year) {
        System.out.println("\nEx 5: ");
        int day = 0;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2: {
                if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
                    day = 29;
                    break;
                } else day = 28;
                break;
            }
            default:
                day = 31;
        }
        System.out.println("The day in " + month + "month in " + year + " year is: "+day);
    }
    public void ex6(int n){
        System.out.println("\n Ex 6: ");
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s += (float) 1/ i;
        }
        System.out.println("S = "+ s);
    }
    public static long factorial(int n)
    {
        long f = 1;
        for (int i = 1; i <=n ; i++) {
            f*=i;
        }
        return f;
    }
    public static void ex7(int n)
    {
        System.out.println("\nEx 7: ");
        float s = 15;
        float k;
        for (int i = 1; i <= n ; i++) {
            k = 1/((float) Math.pow(-1,i)*factorial(i));
            s +=k;
        }
        System.out.println("S = "+s);
    }
    public static void ex8(int n)
    {
        System.out.println("\nEx 8: ");
        float s = 0;
        for (int i = 1; i <=n ; i++) {
            s += 1/ (float)factorial(2*i -1);
        }
        System.out.println("S = "+s);
    }
    public void ex9(int n)
    {
        System.out.println("\nEx 9: ");
        long p = 1;
        for (int i = n; i >= 1 ; i-=2) {
            p*=i;
        }
        System.out.println(n+"!! = "+p);
    }
    public void ex10(int n)
    {
        System.out.println("\nEx 10: ");
        int s = 0, p = 1,m;
        while( n != 0)
        {
            m = n%10;
            s+=m;
            p*=m;
            n = n/10;
        }
        System.out.println("S = "+s+" P = "+p);
    }
    public static boolean prime(int n)
    {
        int count = 0;
        for(int i=1; i<=n/2;i++)
        {
            if(n%i == 0) count++;
        }
        return count == 1;
    }
    public static void ex11PrimeCheck(int n)
    {
        System.out.println("\nEx 11: ");
        System.out.println(n+ " is a prime ? "+ prime(n));
    }
    public void ex12SquareNumberCheck(int n)
    {
        System.out.println("\nEx 12: ");
        int m = (int) Math.sqrt(n);
        System.out.println(n+ " is a square number ? "+ (m*m == n));
    }
    public void ex13SymmetricNumberCheck(int n)
    {
        System.out.println("\nEx 13: ");
        System.out.println();
        int m = 0,k,i=n;
        while (n != 0)
        {
            k = n%10;
            m = m*10 +k;
            n = n / 10;
        }
        System.out.println(i + " is a symmetric number ? "+ (m == i));
    }
    public void ex14PrintPrime(int n)
    {
        System.out.println("\nEx 14: ");
        for (int i = 2; i <= n ; i++) {
            if(prime(i)) System.out.println(i);
        }
    }
    public static boolean perfectNumberCheck(int n)
    {
        int s = 0;
        for (int i = 1; i <= n/2 ; i++) {
            if(n%i == 0) s+=i;
        }
        return n == s;
    }
    public static void ex15PerfectNumber()
    {
        System.out.println("\nEx 15: ");
        for (int i = 1; i <= 1000 ; i++) {
            if(perfectNumberCheck(i)) System.out.println(i);
        }
    }
    public void ex16Fibonaci(int n)
    {
        System.out.println("\nEx 16: ");
        int[] i = new int[n];
        i[0] = i[1] = 1;
        for (int j = 2; j < n ; j++) {
            i[j] = i[j-1] + i[j-2];
        }
        for (int j = 0; j < n ; j++) {
            System.out.print(i[j]+" ");
        }
        System.out.println("\n");
    }
    public void ex17FibonaciNumberCheck(int n)
    {
        System.out.println("\nEx 17: ");
        int fib1 = 1, fib2 = 1,fib=0;
        while (fib1 + fib2 <= n)
        {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        System.out.println(n + " is a Fibonaci number ? "+(fib == n));
    }
    public void ex18TheGreatestCommonDivisorAndTheLeastCommonMultiple(int a, int b)
    {
        System.out.println("\nEx 18: ");
        int m = a,n = b;
        while(a !=b)
        {
            if(b>a) b = b - a;
            else if(a > b) a = a - b;
        }
        System.out.println("The greatest common divisor: "+a);
        System.out.println("the lease common multiple: "+(m*n)/a);
    }

    public static void main(String[] args) {
        JavaEx javaEx = new JavaEx();
        javaEx.one1FirstDegreeEquation(2,0);
        javaEx.ex2SecondDegreeEquation(1,5,4);
        javaEx.ex3IntermediaryNumber(1,2,3);
        javaEx.ex4Karaoke(30,10);
        javaEx.ex5DayInCalendar(2,1000);
        javaEx.ex6(3);
        javaEx.ex7(5);
        javaEx.ex8(3);
        javaEx.ex9(5);
        javaEx.ex10(234);
        javaEx.ex11PrimeCheck(131);
        javaEx.ex12SquareNumberCheck(1024);
        javaEx.ex13SymmetricNumberCheck(13231);
        javaEx.ex14PrintPrime(31);
        javaEx.ex15PerfectNumber();
        javaEx.ex16Fibonaci(10);
        javaEx.ex17FibonaciNumberCheck(55);
        javaEx.ex18TheGreatestCommonDivisorAndTheLeastCommonMultiple(123,456);
    }
}
