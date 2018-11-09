package Loc.Grocery;

public class DiscountBill extends GroceryBill{
    public DiscountBill( Customer customer, boolean preferred){
        super(customer);
    }
    public int getDiscountCount () {
        int numberOfDiscountedItem =0 ;
        for (Item item : items
             ) {
            if(item.getDiscount() != 0) {
                numberOfDiscountedItem++;
            }

        }

        return numberOfDiscountedItem;
    }
    public double getDiscountAmount () {
        double totalDiscount = 0;
        for (Item item : items
        ) {
            totalDiscount+=item.getDiscount();
        }
        return totalDiscount;
    }
    public double getDiscountPercent () {
        return 0;
    }


}
