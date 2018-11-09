//
//package Loc.Polymorphism;
//
//import java.util.Scanner;
//
//public class CakeApplication {
//    public static void main(String[] args) {
//        int quantitySold=0,totalPrice=0;
//        String name1="";
//        double rate1=0;
//
//        Cake[] cake= new Cake[20];
//        Scanner index = new Scanner(System.in);
//        for(int i=0;i<cake.length;i++)
//        {
//            System.out.println("order or make ? press 0 or 1");
//            int choice = index.nextInt();
//            if(choice ==1 ){
//                 cake[i] = new OrderCake();
//            }
//            else {
//                cake[i] = new ReadyMadeCake();
//            }
//        }
//        for(int i=0;i<cake.length;i++){
//            if(cake[i] instanceof OrderCake){
//                cake[i].name=index.nextLine();
//                cake[i].rate=index.nextDouble();
//                ((OrderCake) cake[i]).weight=index.nextInt();
//            }
//            else{
//                cake[i].name=index.nextLine();
//                cake[i].rate=index.nextDouble();
//                ((ReadyMadeCake) cake[i]).quantity=index.nextInt();
//                quantitySold = ((ReadyMadeCake)cake[i]).quantity;
//            }
//            totalPrice+=cake[i].calcPrice();
//        }
//        System.out.println("the total price: "+totalPrice+" the quantity sold for ready cake: "+quantitySold);
//        double max=cake[0].calcPrice();
//        for(int i=0;i<cake.length;i++){
//            if(cake[i].calcPrice()>max){
//                max=cake[i].calcPrice();
//                 name1=cake[i].name;
//                 rate1=cake[i].rate;
//            }
//            System.out.println("info of the highest price "+name1+ "and "+rate1);
//        }
//
//
//
//        }
//
//    }
//
//
