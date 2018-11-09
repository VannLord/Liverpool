package Loc.Polymorphism;

import Loc.Grocery.Item;

public class ReadyMadeCake extends Item {
    public int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price = quantity*rate;
    public double getPrice(){
        return quantity*rate;
    }
    public ReadyMadeCake(){}
    public ReadyMadeCake(String name, double rate, int quantity){
        super(name, rate);
        this.quantity= quantity;
    }

    @Override
    public String toString() {
        return "ReadyMadeCake{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
    public double getDiscount(){
        ReadyMadeCake readyMadeCake = new ReadyMadeCake();
        if(readyMadeCake.getQuantity() > 5){
            readyMadeCake.price = (1 -readyMadeCake.discountOfCake)*readyMadeCake.price;
            return readyMadeCake.discountOfCake*readyMadeCake.price;
        }
        else return 0;
    }
}
