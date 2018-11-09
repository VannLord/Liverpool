package Loc;

import java.util.Scanner;

public class Hannah {
    public static void main(String[] args) {
        Scanner index= new Scanner(System.in);
        int age;
        String name,city,college,profession,animal,pet;
        System.out.println("what is your age ?");
        age=index.nextInt();
        System.out.println("what is your last name ?");
        name=index.nextLine();
        System.out.println("what if the name of your city ?");
        city=index.nextLine();
        System.out.println("what is the name of your college ?");
        college=index.nextLine();
        System.out.println("what is your profession ?");
        profession=index.nextLine();
        System.out.println("what is your favorite type of animal ?");
        animal=index.nextLine();
        System.out.println("what is your pet's name ?");
        pet=index.nextLine();
        System.out.println("There once was a person  "+name+"who lived in "+city+"." +
                " At the age of "+age+","+name+" went to college at "+college+"" +
                ". "+name+"  graduated and to work as a "+profession+"" +
                ". Then "+name+" adopted a(n)"+animal+" named"+pet+". They both lived happily ever after!");
    }
}
