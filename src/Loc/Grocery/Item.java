package Loc.Grocery;

public  class Item {
    Item item = new Item();
    public String name;
    public double rate;
    public double discountOfShoe = 10;
    public static double discountOfCake = 0.2;


    public Item(){}

    public Item(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public double getPrice(){
        return 0;
    };
    public double getDiscount(){
        return 0;
    };
    public  void getInfo () {
        System.out.println(item.toString());;
    }

}
