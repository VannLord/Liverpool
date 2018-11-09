package Loc.AbstractAndInterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }

    @Override
    String makeSound() {
        return "Chicken: cluck-cluckk";
    }
}
