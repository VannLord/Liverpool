package Loc.Grocery;

import java.util.Date;

public class GroceryBill extends Customer{
   public Item[] items = new Item[20];
    int numberOfItem = 0;
    public GroceryBill(Customer customer, Date dateOfOrder){
        super(customer);
        System.out.println(dateOfOrder.toString());
    }

    public GroceryBill(Customer customer) {
        super("abc","abc","abc");
    }


    public void add(Item item){
        if(numberOfItem <= items.length){
            items[numberOfItem] = item;
            numberOfItem++;
        }
        else {
            items = new Item[items.length + 10];
            items[numberOfItem] = item;
            numberOfItem++;
        }

    }
    public double getTotal (){
        double total = 0;
        for (Item item : items
             ) {
            total += item.getPrice();

        }
        return total;
    }
    public void printReceipt (){
        for (Item item : items
        ) {
            System.out.println(item);
        }
    }


}
