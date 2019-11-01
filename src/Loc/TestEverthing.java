package Loc;

import java.util.Date;
import java.util.Random;

public class TestEverthing {
    public static boolean contain(char[] strings, char c){
        for (int i = 0; i < strings.length; i++) {
            if(strings[i] == c) return true;
        }
        return false;
    }
    public static boolean contain(char[] chars, char[] chars1,int a,int b){
        boolean check = true;
        for (int i = a; i < chars1.length; i++) {
            check = check & contain(chars,chars1[i]);
        }
        return check;
    }
    public static int max(int a,int b,int c)
    {
        return (a > b && a > c ? a : (b > c) ? b : c);
    }
    public static int min(int a,int b,int c)
    {
        return ( a < b &&  a < c) ? a : (b < c) ? b : c;
    }
    public static int bai1SoTrungGian(int a,int b,int c)
    {
        System.out.println("BAI1: ");
        int max = max(a,b,c);
        int min = min(a,b,c);
        return (a+b+c) - min - max;
    }
    public static int bai2SoNgay(int month,int year)
    {
        System.out.println("BAI2: ");
        int day = 0;
//        switch (month)
//        {
//            case 4:
//            case 6:
//            case 9:
//            case 11: day = 30;break;
//            case 2: {
//                if(((year % 4 == 0) && (year % 100 != 0) )|| year % 400 == 0  ){
//                    day = 29;break;
//                }
//                else day = 28;break;
//            }
//            default: day = 31;
//        }
        return day;
    }
    public static void bai3InTongTich(int m)
    {
        System.out.println("BAI3: ");
        int sum = 0;
        int mul = 1;
        int i = 0;
//        while (m != 0){
//            i = m % 10;
//            sum += i ;
//            mul *= i;
//            m = m / 10;
//        }
        System.out.println("sum = "+ sum);
        System.out.println("mul = "+ mul);
        System.out.println("\n");
    }
    public static long bai4GiaiThua(int n)
    {
        System.out.println("BAI4: ");
        long gt = 1 ;
        while(n > 0)
        {
            gt *= n;
            n -= 2;
        }
        return gt;
    }
    public static void bai5DaoNguoc(int n)
    {
        System.out.println("BAI5: ");
        while(n != 0){

        System.out.print(n%10);
        n = n/10;
    }
        System.out.println("\n");
    }

    public static long giaiThua(int n)
    {
        int p = 1;
        for(int i = n; i>0;i--)
        {
            p*=i;
        }
        return p;
    }
    public static float bai6TinhS(int n)
    {
        System.out.println("BAI6: ");
        float s = 15;
        for(int i = n;i>0;i--)
        {
            s = s + (1/(float)giaiThua(i));
        }
        return s;
    }
    public static void bai7SoNguyenTo(int n)
    {
//        System.out.println("\nBai7: ");
//        int count = 0;
//        for(int i=1; i<=n/2;i++)
//        {
//            if(n%i == 0) count++;
//        }
//        System.out.println(n+ " la so nguyen to ? "+ (count==1));

    }
    public static boolean soHoanHao(int n)
    {
        int sum = 0;
//        for(int i=1; i<=n/2;i++)
//        {
//            if(n%i == 0) sum+=i;
//        }
        return sum == n;

    }
    public static void bai9SoHoanHaoBeHon1k()
    {
        System.out.println("\nBai 9:");
        int i = 1;
        while (i < 10000)
        {
            if(soHoanHao(i)) System.out.println(i);
            i++;
        }

    }
    public static void bai8KiemTraSoChinhPhuong(int n)
    {
        int i =(int) Math.sqrt(n);
        System.out.println(n+ " la so chinh phuong ? "+ (i*i==n));
    }
    public static long bai10(int n)
    {
        System.out.println("\nBai 10: ");
        long p = n;
        int m = n%2;
        while(true){
            n--;
            if(n%2 != m) continue;
            if(n <= 1) break;
            p *= n;
        }
        return p;
    }

    public static void main(String[] args) {
        TestEverthing testEverthing = new TestEverthing();

        System.out.println(testEverthing.bai1SoTrungGian(14500,1234121,112612321)+"\n");
        System.out.println(testEverthing.bai2SoNgay(2,1000)+"\n");
        testEverthing.bai3InTongTich(336);
        System.out.println(testEverthing.bai4GiaiThua(6)+"\n");
        testEverthing.bai5DaoNguoc(51254);
        System.out.println(testEverthing.bai6TinhS(2)+"\n");
        testEverthing.bai7SoNguyenTo(131);
        testEverthing.bai9SoHoanHaoBeHon1k();
        System.out.println(testEverthing.bai10(9));
//        char[] chars = "LordKanc".toCharArray();
//        char[] chars1 = "Loc".toCharArray();
//        System.out.println(""+contain(chars,chars1,0,chars.length));

//        Random random = new Random();
//        for(int i=0;i<20;i++){
//            System.out.print(""+(1+random.nextInt(6)));
//        }
//        Date date = new Date();
//        System.out.println(""+date.getYear());
//        System.out.println(""+date.getMonth());
//        System.out.println(""+date.getDate());
//        System.out.println(""+date.getDay());
//        int a=214748365;
//{
//	char A[255]={'n','g','u','y','e','n',' ','p','h','a','n',' ','t','h','a','n','h',' ','n','h','a','t',' '},x[10];
//
//	int i=0,j,t=0;
//	while (i<255)
//	{	
//		if(A[i]==' ')
//		{
//			for(j=t;j<i;j++) 
//			{
//				x[j]=A[j];
//			}
//			t=i+1;
//			printf("%s\n",x);
//		}
//		i+=1;
//	}
//	getch();
//	return 0;
//}
//        System.out.printf("%d",a);
//        {
//            char[] A = {'n','g','u','y','e','n',' ','p','h','a','n',' ','t','h','a','n','h',' ','n','h','a','t',' '};
//            char[] x = new char[100];
//
//            int i=0,j=0,t=0;
//            for (i=0;i<A.length;i++)
//            {
//                if (A[i]!=' ')
//                {
//                    x[j]=A[i];
//                    j+=1;
//                }
//                else
//                {
//                    System.out.println(x);
//                    x = new char[100];
//                    j=0;
//                }
//            }
//
//        }
//        int x,y,z,t,u,v;
//        x=4;y=6;z=7;t=8;v=2;
//        z = ++x ;
//        x -= y--;
//        t -= y-- + ++z;
//        u = x+y+z+t;
//        v = v++ + v++;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(t);
//        System.out.println(u);
//        System.out.println(v);

    }

}
