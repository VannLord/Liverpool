package Loc.Grocery;

import java.util.Date;

public class Shoe extends Item{
    private int size;
    private enum  ShoeType{
        summer,winter;
    };
    private ShoeType type;

    public ShoeType getType() {
        return type;
    }

    public void setType(ShoeType type) {
        this.type = type;
    }

    private double price;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Shoe(){}
    public void setDiscountOfShoe(int discountOfShoe) {
        this.discountOfShoe = discountOfShoe;
    }
    public Shoe(int size,ShoeType type,int price,String name,int discount){
        this.size = size;
        this.type = type;
        this.price = price;
        this.name = name;
        this.discountOfShoe = discount;
    }
   public double getDiscount(){
        Shoe shoe = new Shoe();
        Date date = new Date();
        if((shoe.type == ShoeType.summer && (date.getMonth()>=9 || date.getMonth()==0))||(shoe.type == ShoeType.winter && (date.getMonth()>=4 || date.getMonth()<=7))){
            shoe.price = shoe.price - shoe.discountOfShoe;
            return discountOfShoe;
        }
        else return 0;
   }

    @Override
    public String toString() {
        return "Shoe{" +
                "size=" + size +
                ", type=" + type +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
