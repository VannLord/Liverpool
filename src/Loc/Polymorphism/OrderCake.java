package Loc.Polymorphism;

import Loc.Grocery.Item;

public class OrderCake extends Item {
    public double weight;
    double price = weight*rate;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public OrderCake(){}

    public double getPrice(){
        return price;
    }
    public OrderCake(String name,double rate,double weight){
        super(name,rate);
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "OrderCake{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
    public double getDiscount(){
        OrderCake orderCake = new OrderCake();
        if(orderCake.getWeight() > 1){
            orderCake.price = (1 -orderCake.discountOfCake)*orderCake.price;
            return orderCake.discountOfCake*orderCake.price;
        }
        else return 0;
    }

}
