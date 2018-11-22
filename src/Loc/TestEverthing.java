package Loc;

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

    public static void main(String[] args) {
        char[] chars = "LordKanc".toCharArray();
        char[] chars1 = "Loc".toCharArray();
        System.out.println(""+contain(chars,chars1,0,chars.length));
    }
}
