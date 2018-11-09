//package Loc.Polymorphism;
//
//import java.util.Scanner;
//
//public class CakeApplication1 {
//    int cakeNumber=0;
//    Cake[] cakes = new Cake[20];
//    static Scanner scanner = new Scanner(System.in);
//
//    Cake makeOrderCake(){
//        System.out.println("Enter your cake's name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter your cake's rate: ");
//        double rate = scanner.nextDouble();
//        System.out.println("Enter your cake's weight: ");
//        double weight = scanner.nextDouble();
//        return new OrderCake(name,rate,weight);
//    }
//    Cake makeReadyMadeCake(){
//        System.out.println("Enter your cake's name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter your cake's rate: ");
//        double rate = scanner.nextDouble();
//        System.out.println("Enter your cake's quantity: ");
//        int quantity = scanner.nextInt();
//        return new ReadyMadeCake(name,rate,quantity);
//    }
//    void add(Cake cake){
//        if(cakeNumber<cakes.length){
//            cakes[cakeNumber] = cake;
//            cakeNumber++;
//        }
//        else System.out.println("The array is full !!");
//
//    }
//    double totalPriceOfReadyMadeCake(){
//        double totalPriceOfReadyMadeCake=0;
//        for (int i = 0; i <cakes.length ; i++) {
//            if(cakes[i] instanceof ReadyMadeCake){
//                totalPriceOfReadyMadeCake += ((ReadyMadeCake) cakes[i]).calcPrice();
//            }
//        }
//        return totalPriceOfReadyMadeCake ;
//    }
//    int quantityOfReadyMadeCakeSold () {
//        int quantityOfReadyMadeCakeSold = 0;
//        for (int i = 0; i < cakes.length; i++) {
//            if (cakes[i] instanceof ReadyMadeCake) {
//                quantityOfReadyMadeCakeSold += ((ReadyMadeCake) cakes[i]).quantity;
//            }
//        }
//        return quantityOfReadyMadeCakeSold;
//    }
//    Cake infoOfTheMostValuableCake(){
//        double max = cakes[0].calcPrice();
//        int location = 0;
//        for (int i = 0; i <cakeNumber ; i++) {
//            if (max < cakes[i].calcPrice()){
//                max = cakes[i].calcPrice();
//                location = i;
//            }
//
//        }
//        return cakes[location];
//    }
//    double totalPriceOfAllCakes(){
//        double total = 0;
//        for (int i = 0; i < cakeNumber; i++) {
//            total += cakes[i].calcPrice();
//        }
//        return total;
//    }
//
//    public static void main(String[] args) {
//        CakeApplication1 cakeApplication1 = new CakeApplication1();
//        for (int i = 0; i < 2 ; i++) {
//            System.out.println("Choose your type of cake: OrderCake or ReadyMadeCake");
//            String cakeType = scanner.nextLine();
//            if(cakeType.equals("OrderCake")){
//                Cake cake = cakeApplication1.makeOrderCake();
//                cakeApplication1.add(cake);
//                scanner.nextLine();
//            }
//            else{
//                if(cakeType.equals("ReadyMadeCake")){
//                    Cake cake = cakeApplication1.makeReadyMadeCake();
//                    cakeApplication1.add(cake);
//                    scanner.nextLine();
//                }
//                else {
//                    System.out.println("This cake is not available, please enter again");
//                    i--;
//                }
//            }
//        }
//        System.out.println("The total price of all type of cake: "+cakeApplication1.totalPriceOfAllCakes());
//
//        System.out.println("The total price of ReadyMadeCake: "+cakeApplication1.totalPriceOfReadyMadeCake());
//
//        System.out.println("The quantity of ReadyMadeCake: "+cakeApplication1.quantityOfReadyMadeCakeSold());
//
//        System.out.println("The info of the most valuable cake: "+cakeApplication1.infoOfTheMostValuableCake());
//
//    }
//
//}
